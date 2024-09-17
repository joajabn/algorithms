package pl.nyczjablonska.sorting;

public class QuickSort {

    public static int calculatePivotIndex(int[] array, int lastIndex){
        int pivot = array[lastIndex / 2];
        int pivotIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < pivot){
                pivotIndex++;
            }
        }
        return pivotIndex;
    }
// int[] array = {10, 13, 9, 16, 12, 25};
//                 0,  1, 2,  3,  4,  5
// int[] array = {10, 16, 9, 13, 12, 25};

    public static int[] sort(int[] array, int firstIndex, int lastIndex){
        int pivotIndex = calculatePivotIndex(array, lastIndex);
        int temp = array[pivotIndex];
        array[pivotIndex] = array[lastIndex / 2];
        array[lastIndex / 2] = temp;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < array[pivotIndex]) {

            } else if(array[i] > array[pivotIndex]) {
                
            }
        }
        sort(array, 0, pivotIndex - 1);
        sort(array, pivotIndex + 1, array.length - 1);

        return array;
    }

}
