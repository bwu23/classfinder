package classfinder.entities.enums;

/**
 * @author bwu23
 */
public enum SectionType {
	LEC,
	DIS,
	UNDEFINED;
	
	public static SectionType getType(String type) {
		
		switch(type.toUpperCase()) {
		case "LEC":
			return LEC;
		case "DIS":
			return DIS;
		default:
			return UNDEFINED;
		}
	}
}
