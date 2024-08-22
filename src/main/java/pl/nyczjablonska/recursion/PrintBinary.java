package pl.nyczjablonska.recursion;

public class PrintBinary {
    //    5. Zaimplementuj program przyjmujący liczbę i
//    wypisujący na konsolę jej reprezentację bitową.
    public static void main(String[] args) {
        printBinary(47);

    }

    public static void printBinary(int number) {
        if (number > 1) {
            printBinary(number / 2);
        }
        System.out.print(number % 2);
    }
}