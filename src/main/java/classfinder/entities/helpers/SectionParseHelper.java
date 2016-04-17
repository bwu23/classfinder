package classfinder.entities.helpers;

import org.jsoup.nodes.Element;

import classfinder.entities.Section;
import classfinder.entities.enums.SectionType;
import classfinder.entities.enums.Status;

public class SectionParseHelper {
	private static final String FORMAT		= "#ctl00_BodyContentPlaceHolder_detselect_pnlBodyContent > table > tbody > tr:nth-child(%d) > .%s";
	public static final String CSS_SELECTOR	= "#ctl00_BodyContentPlaceHolder_detselect_pnlBodyContent > table:nth-child(7) > tbody > tr";
	public static final String ID 			= "dgdClassDataColumnIDNumber";
	public static final String TYPE 		= "dgdClassDataActType";
	public static final String SECTION 		= "dgdClassDataSectionNumber";
	public static final String BLDG 		= "dgdClassDataBuilding";
	public static final String ROOM 		= "dgdClassDataRoom";
	public static final String ENROLLED 	= "dgdClassDataEnrollTotal";
	public static final String ENROLL_CAP	= "dgdClassDataEnrollCap";
	public static final String WAITLISTED 	= "dgdClassDataWaitListTotal";
	public static final String WAITLIST_CAP	= "dgdClassDataWaitListCap";
	public static final String STATUS 		= "dgdClassDataStatus";
	
	public static String generateTag(int row, String tag) {
		return String.format(FORMAT, row+2, tag);	// first entry at nth-child(2)
	}
	
	public static void setValueByTag(Section sec, Element elm) {
		String text = elm.text();
		String className = elm.className();
		switch (elm.className()) {
		case ID: 
			sec.setId(elm.text());
			break;
		case TYPE:
			sec.setType(SectionType.getType(elm.text()));
			break;
		case SECTION:
			sec.setSection(elm.text());
			break;
		case BLDG:
			sec.setBldg(elm.text());
			break;
		case ROOM:
			sec.setRoom(elm.text());
			break;
		case ENROLLED:
			sec.setEnrolled(Integer.parseInt(elm.text().trim()));
			break;
		case ENROLL_CAP:
			sec.setEnrollCap(Integer.parseInt(elm.text().trim()));
			break;
		case WAITLISTED:
			sec.setWaitlisted(Integer.parseInt(elm.text().trim()));
			break;
		case WAITLIST_CAP:
			sec.setWaitlistCap(Integer.parseInt(elm.text().trim()));
			break;
		case STATUS:
			sec.setStatus(Status.getStatus(elm.text()));
			break;
		}
	}
}
