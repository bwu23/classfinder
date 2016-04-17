package classfinder.webparser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import classfinder.entities.Section;
import classfinder.entities.helpers.SectionParseHelper;

/**
 * @author bwu23
 */
public class DataParser extends Section {
	
	private Document document;
	private Elements elements;
	private int current;
	private int size;

	public DataParser(Document document) {
		this.document = document;
		this.current = 1;	// skip the first row
		getTable();
	}
	
	public boolean hasNext() {
		return current < size;
	}
	
	public Section next() {
		Element e = elements.get(current);
		Section s = new Section();
		
		for (int i=0; i<e.childNodeSize(); i++) {
			// for each column in the row
			Node child = e.childNode(i);
			if (child instanceof Element && ((Element) child).className() != "dgdClassDataColumnSpacer") {
				SectionParseHelper.setValueByTag(s, (Element)child);	// set appropriate field for section object
			}
		}
		current++;
		return s;
	}
	
	private void getTable() {
		if (document == null) 
			return;
		
		// fetch table body containing rows of sections for course
		elements = document.select(SectionParseHelper.CSS_SELECTOR);
		size = elements.size();
	}
	
	
}
