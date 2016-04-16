package classfinder.classfinder;

import classfinder.entities.Course;
import classfinder.webparser.utils.ParsedCourseNumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        testParsedCourseNum("C137A","0137A+C+");
        testParsedCourseNum("M16", "0016++M+");
        testParsedCourseNum("31", "0031++++");
        testParsedCourseNum("35L", "0035L+++");
    }
    
    private void testParsedCourseNum(String original, String expected) {
    	Course c = new Course();
    	c.setCourseNum(original);
    	ParsedCourseNumber pcn = new ParsedCourseNumber(c);
    	assertTrue(expected.equals(pcn.getParsedCourseNumber()));
    }
}
