package pl.nyczjablonska.dynamicProgramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NinjaTrainingTest {
    private static Stream<Arguments> provideArraysAndResults() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {10, 40, 70},
                        {20, 50, 80},
                        {30, 60, 90}
                }, 210),
                Arguments.of(new int[][]{
                        {50, 60, 70}
                }, 70),
                Arguments.of(new int[][]{
                        {30, 30, 30},
                        {30, 30, 30}
                }, 60),
                Arguments.of(new int[][]{
                        {1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}
                }, 3),
                Arguments.of(new int[][]{
                        {50, 0, 0},
                        {0, 50, 0},
                        {0, 0, 50}
                }, 150),
                Arguments.of(new int[][]{
                        {100, 0, 0},
                        {0, 50, 0},
                        {0, 0, 90}
                }, 240),
                Arguments.of(new int[][]{
                        {10, 20, 30},
                        {5, 15, 25},
                        {10, 20, 30}
                }, 75)
//                Arguments.of(new int[]{}, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArraysAndResults")
    public void shouldReturnMaxAmountOfMoney(int[][] array, int result){
        int actual = NinjaTraining.ninjaTraining(array);
        assertEquals(result, actual);
    }
    @Test
    public void shouldReturn29() {
        int[][] array = {{8, 10, 5},
                {2, 11, 7},
                {5, 4, 10}};
        int actual = NinjaTraining.ninjaTraining(array);
        assertEquals(29, actual);
    }

}