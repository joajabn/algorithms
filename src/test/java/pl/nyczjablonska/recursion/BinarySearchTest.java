package pl.nyczjablonska.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private final int[] sortedArray = {2, 3, 5, 8, 11, 15, 17, 25, 29, 34, 38};
    private final int lastIndex = sortedArray.length - 1;
    private static Stream<Arguments> provideNumbersAndResults() {
        return Stream.of(
                Arguments.of(34, 9),
                Arguments.of(5, 2),
                Arguments.of(15, 5),
                Arguments.of(1, -1),
                Arguments.of(40, -1),
                Arguments.of(14, -1)
        );
    }
    @ParameterizedTest
    @MethodSource("provideNumbersAndResults")
    public void testBinarySearch(int numberToFind, int expectedOutput){
        //when
        int firstIndex = 0;
        int actual = BinarySearch.search(sortedArray, firstIndex, lastIndex, numberToFind);

        //then
        assertEquals(expectedOutput, actual);
    }
}