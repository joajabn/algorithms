package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    public void testFibonacci() {
        //given when
        int actual = Fibonacci.fibonacciRecursion(15);

        //then
        assertEquals(610, actual);
    }

}