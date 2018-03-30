package org.emirates.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class JavaUtils {

	public static Map<String, String> calenderPicker(String inputDate) {

		LocalDate date = LocalDate.parse(inputDate);

		Map<String, String> dateMap = new HashMap<String, String>();

		dateMap.put("Year", Integer.toString(date.getYear()));
		dateMap.put("Month", Integer.toString(date.getMonthValue() - 1));
		dateMap.put("Day", Integer.toString(date.getDayOfMonth()));

		System.out.println(dateMap);

		return dateMap;

	}
}
