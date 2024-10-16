package pl.nyczjablonska.dynamicProgramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    private static Stream<Arguments> provideArraysAndResults() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{2, 7, 9, 3, 1}, 12),
                Arguments.of(new int[]{10, 1, 10, 1, 10}, 30),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{10, 20}, 20),
                Arguments.of(new int[]{5, 5, 5, 5, 5}, 15),
                Arguments.of(new int[]{5, 3, 4, 11, 2}, 16)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArraysAndResults")
    public void shouldReturnMaxAmountOfMoney(int[] array, int result){
        int actual = HouseRobber.maxHouseRobbing(array);
        assertEquals(result, actual);
    }
    @Test
    public void shouldReturnMaxAmountOfMoneyMemo(){
        int[] array = {2, 7, 0, 3, 1};
        int actual = HouseRobber.maxHouseRobbing(array);
        assertEquals(10, actual);
    }
}