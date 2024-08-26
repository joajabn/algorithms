package pl.nyczjablonska.sorting;

import java.util.Arrays;

public class MergeSort {
    //    {10, 9, 3, 4, 11, 0, 5}
    public static int[] sort(int[] array) {
//        int middleIndex = (array.length - 1) / 2;
        int length = array.length;
        int[] leftArray = Arrays.copyOfRange(array, 0, length / 2);
        int[] rightArray = Arrays.copyOfRange(array, length / 2, array.length);
        if (leftArray.length > 1) {
            leftArray = sort(leftArray);
        }

        if (rightArray.length > 1) {
            rightArray = sort(rightArray);
        }
        return merge(leftArray, rightArray);
    }

    public static int[] merge(int[] leftArray, int[] rightArray) {
        int leftIndex = 0;
        int rightIndex = 0;
        int[] result = new int[leftArray.length + rightArray.length];
        int resultIndex = 0;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                result[resultIndex] = leftArray[leftIndex];
                resultIndex++;
                leftIndex++;
            } else {
                result[resultIndex] = rightArray[rightIndex];
                resultIndex++;
                rightIndex++;
            }
        }
        while (rightIndex < rightArray.length) {
            result[resultIndex] = rightArray[rightIndex];
            resultIndex++;
            rightIndex++;
        }
        while (leftIndex < leftArray.length) {
            result[resultIndex] = leftArray[leftIndex];
            resultIndex++;
            leftIndex++;
        }
        return result;
    }
}
