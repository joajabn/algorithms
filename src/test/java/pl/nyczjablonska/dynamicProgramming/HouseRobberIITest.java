package pl.nyczjablonska.dynamicProgramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIITest {
    private static Stream<Arguments> provideArraysAndResults() {
        return Stream.of(
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{5, 10}, 10),
                Arguments.of(new int[]{5, 10, 15}, 15),
                Arguments.of(new int[]{5, 10, 15, 20}, 30),
                Arguments.of(new int[]{20, 15, 10, 5}, 30),
                Arguments.of(new int[]{10, 1, 10, 1, 10}, 20),
//                Arguments.of(new int[]{10, 2, 5, 20, 25, 30, 10, 50, 60, 1}, 130),
                Arguments.of(new int[]{5, 10, 20, 15, 25}, 45),
                Arguments.of(new int[]{}, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArraysAndResults")
    public void shouldReturnMaxAmountOfMoney(int[] array, int result){
        int actual = HouseRobberII.maxHouseRobbing(array);
        assertEquals(result, actual);
    }
    @Test
    public void shouldReturnMaxAmountOfMoney(){
        int[] array = {10, 1, 10, 1, 10};
        int actual = HouseRobberII.maxHouseRobbing(array);
        assertEquals(20, actual);
    }

}