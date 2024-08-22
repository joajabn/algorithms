package pl.nyczjablonska.sorting;

public class InsertionSort {
    public int[] sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < i; j++){
                if(array[i] < array[j]){
                    swap(i, j, array);
                }
            }
        }
        return array;
    }

    public void swap(int index1, int index2, int[] array){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
