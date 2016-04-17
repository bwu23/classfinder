package classfinder.webparser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import classfinder.entities.Course;
import classfinder.webparser.utils.UrlGenerator;

/**
 * @author bwu23
 */
public class DataFetcher {
	public static Document get(Course c) throws IOException {
		String url = UrlGenerator.getUrl(c);
		return Jsoup.connect(url).get();
	}
}
