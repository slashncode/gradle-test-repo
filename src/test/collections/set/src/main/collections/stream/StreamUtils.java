package test.collections.set.src.main.collections.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamUtils {

	/**
	 * Filter the keys from the given Map, that are < 10, sort them in ascending
	 * order and collect them into a List.
	 */
	public static List<Integer> fetchKeysSmallerThanTen(Map<Integer, String> integerToStringMap) {
		return integerToStringMap.keySet().stream().sorted().filter(x -> x < 10).collect(Collectors.toList());
	}

	/**
	 * Multiply every element in the given Set by 2, sort them in descending order
	 * and return them as a LinkedHashSet.
	 */
	public static LinkedHashSet<Integer> doubleAndSort(Set<Integer> integerSet) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		integerSet.stream().map(x -> x*2).sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(() -> linkedHashSet));
		return linkedHashSet;
	}

	/**
	 * Compute the product of all elements in the given Collection. If the
	 * Collection is empty, return 1 as it is the neutral element for
	 * multiplication.
	 */
	public static Integer product(Collection<Integer> integerList) {
		return integerList.stream().reduce((x,y) -> x*y).orElse(1);
	}
}
