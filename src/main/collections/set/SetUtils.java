package main.collections.set;

import java.util.*;

public class SetUtils {

	/**
	 * Get the biggest element of the given Set and return it.
	 *
	 * @throws NoSuchElementException if the given Set is empty.
	 */
	public static Integer getBiggestInteger(Set<Integer> integerSet) throws NoSuchElementException {
		return Collections.max(integerSet);
	}

	/**
	 * Create and return a TreeSet, that contains the Integers from 1 to 9 in
	 * descending order.
	 */
	public static TreeSet<Integer> createTreeSet() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 1; i <= 9; i++) {
			treeSet.add(i);
		}
		return treeSet;
	}

	/**
	 * Get and return three elements from the given Set.
	 *
	 * @throws NoSuchElementException if the given Set contains less than three
	 *                                elements.
	 */
	public static Set<String> getThreeElements(Set<String> stringSet) throws NoSuchElementException {
		if (stringSet.size() < 3) {
			throw new NoSuchElementException();
		}
		Set<String> threeEl = new HashSet<>();

		Iterator it = stringSet.iterator();
		Integer intI = 1;

		while (it.hasNext() && intI <= 3 ) {
			threeEl.add(it.next().toString());
			intI++;
		}
		return threeEl;
	}

}
