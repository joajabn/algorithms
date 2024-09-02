package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintBinaryTest {
    @Test
    public void testPrintBinary() {
        //gievn
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // when
        PrintBinary.printBinary(47);

        //then
        assertEquals("101111", outContent.toString());
    }
}