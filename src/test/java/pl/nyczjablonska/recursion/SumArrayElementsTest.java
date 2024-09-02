package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

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
        int expectedOutput = 0;
        for(int i = 0; i < array.length; i++){
            expectedOutput += array[i];
        }

        //then
        assertEquals(expectedOutput, actual);
    }
}