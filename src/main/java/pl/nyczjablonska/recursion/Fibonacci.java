package pl.nyczjablonska.recursion;

import java.util.Random;

public class Fibonacci {

    public static int fibonacciRecursion(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fibonacciRecursion(i - 2) +
                fibonacciRecursion(i - 1);
    }
}
