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
		words[0] = "0" + words[0];
		words[1] = "0" + words[1];
		String value = "";
		for (String word : words) {
			if(count < 8) {
				value += String.format("%6s", word);
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
	
	private static String partsDay(String s) {
		String last= "";
		int count = 0;
		String[] mas = s.split(" ");
		for (String string : mas) {
			count++;
			if(count == 4) {
				last += String.format("%9s", string) + "   ";
			}
			else last += String.format("%9s", string) + "   ";
		}
		return last;
	}
	
	
	
	//get Date, but wrong
	private static String getYearFromString() throws Exception {
		Pattern pattern = Pattern.compile("\\d{4}");
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


		// Main output
		for (Element day : dates) {
			String date = day.select("p").text();
			System.out.println(date + " " + getYearFromString()); // Date
			System.out.println();

			for (Element part : partOfDay) {
				String parts = part.select("td").text();
				parts = partsDay(parts);
				System.out.println(parts);			//The part of a day
				for (Element info : infoValues) {
					String value = info.select("tr").text();
					value = rebuildString(value);
					mas = infoString(value);
					for (String ss : mas) {
						System.out.println(ss);//other info
					}
				}
			}
			System.out.println("------------------------------------------------");
		}
	}

	public static void main(String[] args) throws Exception {
		sample();
	}

}
