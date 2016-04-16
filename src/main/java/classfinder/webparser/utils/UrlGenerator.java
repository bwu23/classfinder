package classfinder.webparser.utils;

import classfinder.entities.Course;
import classfinder.entities.enums.Quarter;

/**
 * @author bwu23
 */
public class UrlGenerator {
	
	private static final String BASE_URL = "http://www.registrar.ucla.edu/schedule/detselect.aspx";
	
	private static String formatCourseNum(Course c) {
		ParsedCourseNumber pcn = new ParsedCourseNumber(c);
		return pcn.getParsedCourseNumber();
	}
	private static String formatDept(String dept) {
		return dept.replace(' ', '+');
	}
	
	private static String formatQtr(Quarter q) {
		switch(q) {
		case FALL:
			return "F";
		case WINTER:
			return "W";
		case SPRING:
			return "S";
		default:
			return null;
		}
	}

	public static String getUrl(Course course) {
		
		String result = String.format(BASE_URL + "?termsel=%d%s&subareasel=%s&idxcrs=%s",
				course.getYear(), 
				formatQtr(course.getQtr()),
				formatDept(course.getDept()),
				formatCourseNum(course));
		
		return result;
	}
}
