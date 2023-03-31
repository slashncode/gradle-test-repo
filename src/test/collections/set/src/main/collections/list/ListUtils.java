package test.collections.set.src.main.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListUtils {

	/**
	 * Create and return a LinkedList with the following Strings: "This", "is",
	 * "my", "first", "LinkedList".
	 */
	public static List<String> createLinkedList() {
		return new LinkedList<String>(Arrays.asList("This","is","my","first","LinkedList"));
	}

	/**
	 * Get the 5th element of the given List.
	 *
	 * @throws IndexOutOfBoundsException if integerList.size() < 5
	 */
	public static Integer getFifthElement(List<Integer> integerList) throws IndexOutOfBoundsException {
		return integerList.get(4);
	}

	/**
	 * Sort the given List in ascending order and return it.
	 */
	public static List<Integer> sortAscending(List<Integer> integerList) {
		Collections.sort(integerList);
		return integerList;
	}

}
