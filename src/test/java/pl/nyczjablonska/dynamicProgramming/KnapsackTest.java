package pl.nyczjablonska.dynamicProgramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackTest {
    private static Stream<Arguments> provideArraysAndResults() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 7000}, {6, 8000}, {4, 3000}, {2, 7000}}, 7, 14000),
                Arguments.of(new int[][]{{5, 7000}, {4, 3000}, {3, 8000}, {1, 4000}}, 7, 12000),
                Arguments.of(new int[][]{{5, 1000}, {4, 3000}, {3, 10000}, {3, 4000}}, 5, 10000),
                Arguments.of(new int[][]{{1, 500}, {2, 1000}, {3, 2000}}, 3, 2000)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArraysAndResults")
    public void shouldReturnMaxValue(int[][] array, int weightOfBags, int result){
        int actual = Knapsack.knapsackNoRowOrColumn(array, weightOfBags);
        assertEquals(result, actual);
    }

    @ParameterizedTest
    @MethodSource("provideArraysAndResults")
    public void shouldReturnMaxValue2(int[][] array, int weightOfBags, int result){
        int actual = Knapsack.knapsack(array, weightOfBags);
        assertEquals(result, actual);
    }

}