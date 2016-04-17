package classfinder.webparser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

/**
 * @author bwu23
 */
public class DataFetcher {
	public static void get(String url) {
		try {
			Document doc = Jsoup.connect(url).get();
			Elements elements = doc.select("#ctl00_BodyContentPlaceHolder_detselect_pnlBodyContent > table:nth-child(7) > tbody > tr");
			System.out.println(elements.size());
			for (int i=0; i<elements.size(); i++) {
				Element element = elements.get(i);
				System.out.println(element.text());
				for (int j=0; j<element.childNodeSize(); j++) {
					Node child = element.childNode(j);
					if(child instanceof Element && ((Element) child).className() != "dgdClassDataColumnSpacer") {
						System.out.println("\t"+ ((Element) child).className() + "\t" + ((Element)child).text());
						
					}
				}
			}
			System.out.println("Element value = " + elements.text());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
