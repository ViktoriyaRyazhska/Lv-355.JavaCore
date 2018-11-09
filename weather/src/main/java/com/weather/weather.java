package com.weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	private static Pattern pattern;
	
	private static String rebuildString(String s) {
		s = s.replaceAll("\\s+", " ");
		s = s.replaceAll(" :", ":");
		return s;
	}
	
	private static String[] infoString(String s) {
		int count = 0;
		int i = 0;
		String[] mas = new String[7];
		String[] words = s.split(" ");
		String value = "";
		for (String word : words) {
			if(count < 8) {
				value += word + " ";
				count++;
			}if(count == 8) {
				mas[i] = value;
				i++;
				count = 0;
				value = "";
			}
		}
		return mas;
		
	}
	
	// отримую дату(але неправильно)
	private static String getYearFromString() throws Exception {
		pattern = Pattern.compile("\\d{4}");
		LocalDate localDate = LocalDate.now();
		String ld = (localDate + "");
		Matcher matcher = pattern.matcher(ld);
		if (matcher.find()) {
			return matcher.group();
		}
		throw new Exception("Can't extract date from string!");
	}

	private static void sample() throws Exception {
		Document page = getPage();
		Element tableWth = page.select("div#blockDays").first();
//		System.out.println(tableWth);
		Elements dates = tableWth.select("div.main");
		String[] mas;
		Elements partOfDay = tableWth.select("thead");

		Elements infoValues = tableWth.select("tbody");


		// основний вивід
		for (Element day : dates) {
			String date = day.select("p").text();
			System.out.println(date + " " + getYearFromString()); // Суббота 10 ноября 2018

			for (Element part : partOfDay) {
				String parts = part.select("td").text();
				System.out.println(parts);			//ночь утро день вечер
				for (Element info : infoValues) {
					String value = info.select("tr").text();
					value = rebuildString(value);
					mas = infoString(value);
					for (String ss : mas) {
						System.out.println(ss);//все остальные данные
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		sample();
	}

}
