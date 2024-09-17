package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrintBinaryTest {
    private static Stream<Arguments> provideNumbersAndResults() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "10"),
                Arguments.of(3, "11"),
                Arguments.of(4, "100"),
                Arguments.of(5, "101"),
                Arguments.of(0, "0"),
                Arguments.of(15, "1111"),
                Arguments.of(47, "101111"),
                Arguments.of(1023, "1111111111")
        );
    }
    @ParameterizedTest
    @MethodSource("provideNumbersAndResults")
    public void testPrintBinarySucceed(int number, String expectedOutput) {
        //given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        // when
        PrintBinary.printBinary(number);

        //then
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void testPrintBinaryWithNegativeNumber(){
        //when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            PrintBinary.printBinary(-5);
        });

        //then
        assertEquals("Number must be non-negative", exception.getMessage());
    }
}
