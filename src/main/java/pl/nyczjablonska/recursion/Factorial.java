package pl.nyczjablonska.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateNumberFactorial(10));
    }
    public static long calculateNumberFactorial(int number){
        if(number <= 1){
            return 1;
        } else {
            return number * calculateNumberFactorial(number - 1);
        }
    }
}
