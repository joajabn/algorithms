package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayElementsTest {
    @Test
    public void shouldReturnSummedArrayElements() {
        //given
        int length = 10;
        int[] array = RandomArrayGenerator.generateArray(length);
        int startIndex = 0;

        //when
        int actual = SumArrayElements.sumArrayElements(array, startIndex);

        //expectedOutput
        int expectedOutput = Arrays.stream(array).sum();

        //then
        assertEquals(expectedOutput, actual);
    }
}