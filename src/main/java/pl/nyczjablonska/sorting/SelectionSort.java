package pl.nyczjablonska.sorting;

public class SelectionSort {
    public int[] sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            int minIndex = findMin(i, array);
            swap(i, minIndex, array);
        }

        return array;
    }

    private int findMin(int startIndex, int[] array) {
        int min = array[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public void swap(int index1, int index2, int[] array){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
