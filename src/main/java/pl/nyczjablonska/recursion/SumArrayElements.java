package pl.nyczjablonska.recursion;

import java.util.Arrays;

public class SumArrayElements {
//    2. Zsumuj wszystkie elementy tablicy intów o długości 10
//    o losowych wartościach.

    public static void main(String[] args) {
        int length = 10;
        int[] array = RandomArrayGenerator.generateArray(length);
        System.out.println(sumArrayElements(array, 0));

    }
    public static int sumArrayElements(int[] array, int startIndex){
//        #1
//        startIndex = lastIndex
//        if(array.length == 1){
//            return array[0];
//        } else {
//            return array[0] + sumArrayElements(Arrays.copyOfRange(array, 1, array.length - 1));
//        }
//        #2
//        startIndex = startIndex
        if(startIndex < array.length){
            return array[startIndex] + sumArrayElements(array, startIndex + 1);
        }
        return 0;
    }
}
