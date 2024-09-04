package pl.nyczjablonska.recursion;

public class DoesSubsequenceSumToK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        int k = 4;
        System.out.println(doesCount(arr, k));
    }
    public static boolean doesCount(int[] arr, int k) {
        return countHelper(arr, k, 0);
    }

    private static boolean countHelper(int[] arr, int k, int index) {
        if(index == arr.length){
            if(k == 0){
                return true;
            } else {
                return false;
            }
        } else {
            boolean take = countHelper(arr, k - arr[index], index + 1);
            boolean notTake = countHelper(arr, k, index + 1);
            return take || notTake;
        }
    }
}
