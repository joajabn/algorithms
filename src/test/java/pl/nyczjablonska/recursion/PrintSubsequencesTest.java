package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrintSubsequencesTest {
    @Test
    public void shouldPrintSubsequences() {
        //given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int[] array = {1, 2, 3, 4};
        List<Integer> variants = new ArrayList<>();

        //when
        PrintSubsequences.printSubsequences(array, 0, variants);

        //expected output
        String expectedOutput = """
                []
                [4]
                [3]
                [3, 4]
                [2]
                [2, 4]
                [2, 3]
                [2, 3, 4]
                [1]
                [1, 4]
                [1, 3]
                [1, 3, 4]
                [1, 2]
                [1, 2, 4]
                [1, 2, 3]
                [1, 2, 3, 4]          
                """;

        //then
        assertEquals(expectedOutput, outContent.toString());
    }

}