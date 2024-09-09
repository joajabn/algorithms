package pl.nyczjablonska.recursion;

import pl.nyczjablonska.sorting.SelectionSort;

import java.util.Arrays;

public class BinarySearch {
    //    3. Zaimplementuj wyszukiwanie binarne na
//    posortowanej tablicy intów o długości 100.
        public static int search(int[] array, int firstIndex, int lastIndex, int numberToFound) {
        if (firstIndex <= lastIndex) {
            int middle = firstIndex + (lastIndex - firstIndex) / 2;
            if (numberToFound < array[middle]) {
                return search(array, firstIndex, middle - 1, numberToFound);
            } else if (numberToFound > array[middle]) {
                return search(array, middle + 1, lastIndex, numberToFound);
            } else {
                return middle;
            }
        }
        return -1;
    }

}
