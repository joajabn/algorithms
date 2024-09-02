package pl.nyczjablonska.recursion;

public class PrintArray {
// 1. Wypisz na konsolę wszystkie elementy z tablicy intów
// o długości 50 o losowych wartościach.
    public static void printArray(int[] array, int startIndex) {
        if (startIndex < array.length) {
            System.out.println(array[startIndex]);
            printArray(array, startIndex + 1);
        }
    }
}
