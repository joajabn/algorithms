package pl.nyczjablonska.recursion;

public class Factorial {
    public static long calculateNumberFactorial(int number){
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        return (number == 0 || number == 1) ? 1 : number * calculateNumberFactorial(number - 1);
    }
}
