package test.collections.set.src.test.collections.set;

import org.junit.jupiter.api.Test;
import test.collections.set.src.main.collections.set.SetUtils;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SetUtilsTests {

	@Test
	void getBiggestInteger() {
		// Arrange
		Set<Integer> integerSet = Set.of(1, 5, 2, 3);
		Integer expectedResult = 5;

		// Act
		Integer actualResult = SetUtils.getBiggestInteger(integerSet);

		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void getBiggestIntegerNoSuchElementException() {
		// Arrange
		Set<Integer> integerSet = Collections.emptySet();

		// Act & Assert
		assertThrows(NoSuchElementException.class, () -> SetUtils.getBiggestInteger(integerSet));
	}

	@Test
	void createTreeSet() {
		// Arrange
		TreeSet<Integer> expectedResult = new TreeSet<>(Comparator.reverseOrder());
		expectedResult.addAll(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

		// Act
		Set<Integer> actualResult = SetUtils.createTreeSet();

		// Assert
		assertEquals(expectedResult, actualResult);
		assertInstanceOf(TreeSet.class, actualResult);
	}

	@Test
	void getThreeElements() {
		// Arrange
		Set<String> stringSet = Set.of("one", "two", "three", "four", "five");

		// Act
		Set<String> actualResult = SetUtils.getThreeElements(stringSet);

		// Assert
		assertTrue(stringSet.containsAll(actualResult));
		assertEquals(3, actualResult.size());
	}

	@Test
	void getThreeElementsNoSuchElementException() {
		// Arrange
		Set<String> stringSet = Set.of("one", "two");

		// Act & Assert
		assertThrows(NoSuchElementException.class, () -> SetUtils.getThreeElements(stringSet));
	}

}
