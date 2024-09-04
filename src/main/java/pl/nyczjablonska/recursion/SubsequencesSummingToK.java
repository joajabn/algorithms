package pl.nyczjablonska.recursion;

import java.util.List;

public class SubsequencesSummingToK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        int k = 4;
        System.out.println(count(arr, k));
    }
    public static int count(int[] arr, int k) {
        return countHelper(arr, k, 0);
    }

    private static int countHelper(int[] arr, int k, int index) {
        if(index == arr.length){
            if(k == 0){
                return 1;
            } else {
                return 0;
            }
        } else {
            int take = countHelper(arr, k - arr[index], index + 1);
            int notTake = countHelper(arr, k, index + 1);
            return take + notTake;
        }
    }
}
