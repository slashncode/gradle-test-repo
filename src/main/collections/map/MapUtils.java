package main.collections.map;

import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.HashMap;
import java.util.Collections;

public class MapUtils {

	/**
	 * Creates and a returns a Map with the following entries: - "milk": 5 -
	 * "bread": 3 - "honey": 1
	 */
	public static Map<String, Integer> createShoppingList() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("milk", 5);
		map.put("bread", 3);
		map.put("honey", 1);
		return map;
	}

	/**
	 * Return the keys of the given Map.
	 */
	public static Set<String> getKeys(Map<String, Integer> stringToIntegerMap) {
		return stringToIntegerMap.keySet();
	}

	/**
	 * Get the biggest value of the given Map.
	 *
	 * @throws NoSuchElementException if the given Map is empty.
	 */
	public static Integer getBiggestValue(Map<String, Integer> stringToIntegerMap) {
		return Collections.max(stringToIntegerMap.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getValue();
	}

}
