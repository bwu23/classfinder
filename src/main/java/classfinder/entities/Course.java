package classfinder.entities;

import classfinder.entities.enums.Quarter;

/**
 * @author bwu23
 */
public class Course {
	private String dept;
	private String courseNum;
	private Quarter qtr;
	private int year;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public Quarter getQtr() {
		return qtr;
	}
	public void setQtr(Quarter qtr) {
		this.qtr = qtr;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
