package classfinder.entities.enums;

public enum Status {
	OPEN,
	CLOSED,
	WAITLIST,
	CANCELLED,
	UNDEFINED;
	
	public static Status getStatus(String value) {
		switch(value.toUpperCase()) {
		case "OPEN":
			return OPEN;
		case "CLOSED":
			return CLOSED;
		case "W-LIST":
			return WAITLIST;
		case "CANCELLED":
			return CANCELLED;
		default: 
			return UNDEFINED;
		}
	}
}
