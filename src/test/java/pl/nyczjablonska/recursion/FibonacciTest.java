package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private static Stream<Arguments> provideNumbersAndResults() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(5, 5),
                Arguments.of(10, 55),
                Arguments.of(20, 6765)
        );
    }
    @ParameterizedTest
    @MethodSource("provideNumbersAndResults")
    public void testFibonacci(int i, int expectedResult) {
        //given when
        int actual = Fibonacci.fibonacciRecursion(i);

        //then
        assertEquals(expectedResult, actual);
    }

}