package pl.nyczjablonska.recursion;

import pl.nyczjablonska.sorting.SelectionSort;

import java.util.Arrays;

public class BinarySearch {
    //    3. Zaimplementuj wyszukiwanie binarne na
//    posortowanej tablicy intów o długości 100.
    public static void main(String[] args) {
        int length = 100;
//        int[] array = RandomArrayGenerator.generateArray(length);
//        SelectionSort sort = new SelectionSort();
//        int[] sortedArray = sort.sort(array);
        int[] sortedArray = {1, 3, 5, 8, 11, 15, 17, 25, 29, 34, 38};
        System.out.println(search(sortedArray, 0, sortedArray.length - 1, 34));
    }

    public static int search(int[] array, int firstIndex, int lastIndex, int numberToFound) {
        if (firstIndex < lastIndex) {
            int middle = (firstIndex + lastIndex) / 2;
            if (numberToFound < array[middle]) {
                return search(array, firstIndex, middle, numberToFound);
            } else if (numberToFound > array[middle]) {
                return search(array, middle, lastIndex, numberToFound);
            } else if (numberToFound == array[middle]){
                return middle;
            }
        }
        return -1;
    }

}
