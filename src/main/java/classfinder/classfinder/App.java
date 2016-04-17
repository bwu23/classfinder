package classfinder.classfinder;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.nodes.Document;

import classfinder.entities.Course;
import classfinder.entities.Section;
import classfinder.entities.enums.Quarter;
import classfinder.entities.helpers.SectionParseHelper;
import classfinder.webparser.DataFetcher;
import classfinder.webparser.DataParser;
import classfinder.webparser.utils.UrlGenerator;

/**
 * @author bwu23
 */
public class App 
{
    public static void main( String[] args ) throws NoSuchFieldException, SecurityException
    {
    	Course c = new Course();
    	c.setCourseNum("31");
    	c.setDept("COM SCI");
    	c.setQtr(Quarter.SPRING);
    	c.setYear(16);
    	
    	ArrayList<Section> sections = new ArrayList<Section>();
    	try {
			Document doc = DataFetcher.get(c);
			DataParser parser = new DataParser(doc);
			while (parser.hasNext()) {
				sections.add(parser.next());
			}
			System.out.println("DONE!");
		} catch (IOException e) {
			e.printStackTrace();
		}
 
    }
}
