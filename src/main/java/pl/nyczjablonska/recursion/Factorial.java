package pl.nyczjablonska.recursion;

public class Factorial {
    public static long calculateNumberFactorial(int number){
        if(number <= 1){
            return 1;
        } else {
            return number * calculateNumberFactorial(number - 1);
        }
    }
}
