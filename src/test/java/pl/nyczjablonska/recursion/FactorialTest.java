package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private static Stream<Arguments> provideNumbersAndResults() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(5, 120),
                Arguments.of(10, 3_628_800),
                Arguments.of(20, 2_432_902_008_176_640_000L)
        );
    }
    @ParameterizedTest
    @MethodSource("provideNumbersAndResults")
    public void testFactorialSucceeded(int number, long expectedOutput) {
        //given when
        long actual = Factorial.calculateNumberFactorial(number);
        //then
        assertEquals(expectedOutput, actual);
    }
    @Test
    public void testFactorialNegativeNumber() {
        //given when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateNumberFactorial(-3);
        });

        //then
        assertEquals("Factorial is not defined for negative numbers", exception.getMessage());
    }
}