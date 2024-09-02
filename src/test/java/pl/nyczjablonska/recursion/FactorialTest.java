package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void testFactorial() {
        //given when
        long actual = Factorial.calculateNumberFactorial(10);

        //then
        assertEquals(3628800, actual);
    }

}