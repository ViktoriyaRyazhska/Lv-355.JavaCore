package com.weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class weather {
	
	private static Document getPage() throws MalformedURLException, IOException {
		String url = "https://sinoptik.ua/%D0%BF%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0-%D0%BB%D1%8C%D0%B2%D0%BE%D0%B2";
		Document page = Jsoup.parse(new URL(url), 3000);
		return page;
	}
	
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		Document page = getPage();
		Element tableWth = page.select("div#blockDays").first();
		Elements mains = tableWth.select("div[class=main]");
		System.out.println(mains);
	
	}

}
