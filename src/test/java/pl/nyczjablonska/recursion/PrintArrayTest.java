package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintArrayTest {
    @Test
    public void testPrintArray() {
        //given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int[] array = RandomArrayGenerator.generateArray(50);
        int startIndex = 0;

        // when
        PrintArray.printArray(array, 0);

        //expectedOutput
        StringBuilder expectedOutput = new StringBuilder();
        if (startIndex >= 0 && startIndex < array.length) {
            for (int i = startIndex; i < array.length; i++){
                expectedOutput.append(array[i]).append("\n");
            }
        }

        //then
        assertEquals(expectedOutput.toString(), outContent.toString());
    }
}