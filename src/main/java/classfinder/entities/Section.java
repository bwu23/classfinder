package classfinder.entities;

import classfinder.entities.enums.SectionType;
import classfinder.entities.enums.Status;

/**
 * @author bwu23
 */
public class Section {
	
	protected long id;
	protected SectionType type;
	protected int section;
	protected String bldg;
	protected String room;
	protected int enrolled;
	protected int enrollCap;
	protected int waitlisted;
	protected int waitlistCap;
	protected Status status;
	
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
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
