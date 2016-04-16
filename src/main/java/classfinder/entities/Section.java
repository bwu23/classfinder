package classfinder.entities;

import classfinder.entities.enums.SectionType;

/**
 * @author bwu23
 */
public class Section {
	private long id;
	private SectionType type;
	private int section;
	private String bldg;
	private String room;
	private int enrolled;
	private int enrollCap;
	private int waitlisted;
	private int waitlistCap;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public SectionType getType() {
		return type;
	}
	public void setType(SectionType type) {
		this.type = type;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getBldg() {
		return bldg;
	}
	public void setBldg(String bldg) {
		this.bldg = bldg;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getEnrolled() {
		return enrolled;
	}
	public void setEnrolled(int enrolled) {
		this.enrolled = enrolled;
	}
	public int getEnrollCap() {
		return enrollCap;
	}
	public void setEnrollCap(int enrollCap) {
		this.enrollCap = enrollCap;
	}
	public int getWaitlisted() {
		return waitlisted;
	}
	public void setWaitlisted(int waitlisted) {
		this.waitlisted = waitlisted;
	}
	public int getWaitlistCap() {
		return waitlistCap;
	}
	public void setWaitlistCap(int waitlistCap) {
		this.waitlistCap = waitlistCap;
	}
}
