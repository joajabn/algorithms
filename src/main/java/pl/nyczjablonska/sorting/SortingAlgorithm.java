package pl.nyczjablonska.sorting;

import java.util.Arrays;

public class SortingAlgorithm {
    public static void main(String[] args) {
        int[] array = {83, 0, 40, 12, 11, 99, 27};
        SelectionSort sort = new SelectionSort();
        System.out.println("Before: ");
        System.out.println(Arrays.toString(array));
        System.out.println("After");
        System.out.println(Arrays.toString(sort.sort(array)));
    }




}

