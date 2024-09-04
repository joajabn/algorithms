package pl.nyczjablonska.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        List<Integer> variants = new ArrayList<>();
        printSubsequences(arr, 0, variants);
    }

    public static void printSubsequences(int[] arr, int index, List<Integer> variants) {
        if (index == arr.length) {
            System.out.println(variants);
        } else {
            // Subsequence without including the element at current index
            printSubsequences(arr, index + 1, variants);

            variants.add(arr[index]);

            // Subsequence including the element at current index
            printSubsequences(arr, index + 1, variants);

            // Backtrack to remove the recently inserted element
            variants.removeLast();
        }
        return;
    }
}

