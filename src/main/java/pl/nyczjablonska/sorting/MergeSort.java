package pl.nyczjablonska.sorting;

import java.util.Arrays;

public class MergeSort {
//    {10, 9, 3, 4, 11, 0, 5}
    public static int[] sort(int[] array){
        int middleIndex = (array[0] + array.length - 1) / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        int[] rightArray = Arrays.copyOfRange(array, middleIndex, array.length);
        if(leftArray.length > 1){
            sort(leftArray);
        }

        if(rightArray.length > 1){
            sort(rightArray);
        }



        return null;
    }
//    left {2, 4}
//    right {3, 5}
//    result {2, 3, 4, 5}
    public static int[] merge(int[] leftArray, int[] rightArray){
        int leftIndex = 0;
        int rightIndex = 0;
        int[] result = new int[leftArray.length + rightArray.length];
        int resultIndex = 0;
        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if(leftArray[leftIndex] < rightArray[rightIndex]){
                result[resultIndex] = leftArray[leftIndex];
                resultIndex++;
                leftIndex++;
            } else {
                result[rightIndex] = rightArray[rightIndex];
                resultIndex++;
                rightIndex++;
            }
        }
        while(rightIndex < rightArray.length){
            result[resultIndex] = rightArray[rightIndex];
            resultIndex++;
            rightIndex++;
        }
        while(leftIndex < leftArray.length){
            result[resultIndex] = leftArray[leftIndex];
            resultIndex++;
            leftIndex++;
        }
        return result;
    }
}
