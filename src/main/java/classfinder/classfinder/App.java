package classfinder.classfinder;

import classfinder.entities.Course;
import classfinder.entities.Section;
import classfinder.entities.enums.Quarter;
import classfinder.entities.helpers.SectionParseHelper;
import classfinder.webparser.DataFetcher;
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
    	System.out.println(SectionParseHelper.generateTag(1, SectionParseHelper.BLDG));
    	DataFetcher.get(UrlGenerator.getUrl(c));
 
    }
}
