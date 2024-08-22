package pl.nyczjablonska.recursion;

public class PrintArray {
// 1. Wypisz na konsolę wszystkie elementy z tablicy intów
// o długości 50 o losowych wartościach.
    public static void main(String[] args) {
        int length = 50;
        int[] array = RandomArrayGenerator.generateArray(length);
        printArray(array, 0);
    }
    public static void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println(array[index]);
            printArray(array, index + 1);
        }
    }
}
