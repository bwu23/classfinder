package classfinder.webparser.utils;

import classfinder.entities.Course;

public class ParsedCourseNumber {
	private String prefix;
	private String suffix;
	private String number;
	
	private boolean parse(String courseNum) {
		while(!courseNum.isEmpty() &&  Character.isLetter(courseNum.charAt(0))) {
			prefix = prefix.concat(courseNum.substring(0, 1));
			courseNum = courseNum.substring(1);
		}
		
		while(!courseNum.isEmpty() && Character.isDigit(courseNum.charAt(0))) {
			number = number.concat(courseNum.substring(0,1));
			courseNum = courseNum.substring(1);
		}
		
		while(!courseNum.isEmpty() && Character.isLetter(courseNum.charAt(0))) {
			suffix = suffix.concat(courseNum.substring(0,1));
			courseNum = courseNum.substring(1);
		}
		
		if (prefix.length() > 2 || number.length() > 4) 
			return false;
		
		while(prefix.length() < 2)
			prefix = prefix.concat("+");
		while(number.length() < 4)
			number = "0".concat(number);
		while(suffix.length() < 2)
			suffix = suffix.concat("+");
		
		return true;
	}
	
	public ParsedCourseNumber(Course course) throws IllegalArgumentException {
		String courseNum = course.getCourseNum();
		prefix = suffix = number = "";
		
		if (!parse(courseNum)) {
			throw new IllegalArgumentException();
		}
	}
	
	public String getParsedCourseNumber() {
		return number + suffix + prefix;
	}
}
