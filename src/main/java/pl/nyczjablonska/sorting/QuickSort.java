package pl.nyczjablonska.sorting;

public class QuickSort {

    public int calculatePivotIndex(int[] array, int firstIndex, int lastIndex){
        int pivot = array[(firstIndex + lastIndex) / 2];
        int pivotIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < pivot){
                pivotIndex++;
            }
        }
        return pivotIndex;
    }
// int[] array = {10, 13, 14*, 16, 12, 25};
//                 0,  1,  2,  3,  4,  5
//int[] array = { 10, 13, 16, 14*, 12, 25};
//int[] array = { 10, 13, 12, 14*, 16, 25};

    public int[] sort(int[] array, int firstIndex, int lastIndex){
        if(firstIndex >= lastIndex) {
            return array;
        }
        int finalPivotIndex = calculatePivotIndex(array, firstIndex, lastIndex);
        int temp = array[finalPivotIndex];
        int actualPivot = (firstIndex + lastIndex) / 2;
        array[finalPivotIndex] = array[actualPivot];
        array[actualPivot] = temp;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > array[finalPivotIndex]) {
                for(int j = finalPivotIndex + 1; j < array.length; j++){
                    if(array[j] < array[finalPivotIndex]) {
                        int temp2 = array[j];
                        array[j] = array[i];
                        array[i] = temp2;
                        j = array.length;
                    }
                }
            }
        }
        sort(array, firstIndex, finalPivotIndex - 1);
        sort(array, finalPivotIndex + 1, lastIndex);

        return array;
    }

}
