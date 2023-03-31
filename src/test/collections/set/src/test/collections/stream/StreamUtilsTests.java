package test.collections.set.src.test.collections.stream;

import org.junit.jupiter.api.Test;
import test.collections.set.src.main.collections.stream.StreamUtils;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class StreamUtilsTests {

	@Test
	void fetchKeysSmallerThanTen() {
		// Arrange
		Map<Integer, String> integerToStringMap = Map.of(1, "one", 20, "twenty", -5, "minus five");
		List<Integer> expectedResult = List.of(-5, 1);

		// Act
		List<Integer> actualResult = StreamUtils.fetchKeysSmallerThanTen(integerToStringMap);

		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void doubleAndSort() {
		// Arrange
		Set<Integer> integerSet = Set.of(1, 2, 4, 8);
		LinkedHashSet<Integer> expectedResult = new LinkedHashSet<>(List.of(16, 8, 4, 2));

		// Act
		Set<Integer> actualResult = StreamUtils.doubleAndSort(integerSet);

		// Assert
		assertEquals(expectedResult, actualResult);
		assertInstanceOf(LinkedHashSet.class, actualResult);
	}

	@Test
	void product() {
		// Arrange
		Set<Integer> integerSet = Set.of(1, 2, 4, 8);
		Integer expectedResult = 1 * 2 * 4 * 8;

		// Act
		Integer actualResult = StreamUtils.product(integerSet);

		// Assert
		assertEquals(expectedResult, actualResult);
	}

}
