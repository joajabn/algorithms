package pl.nyczjablonska.dynamicProgramming.two_dim_arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return countUniquePathsRec(m - 1, n - 1);
    }

    private int countUniquePathsRec(int m, int n) {
        if(m == 0 && n == 0) {
            return 1;
        }
        if(m < 0 || n < 0){
            return 0;
        }
        return countUniquePathsRec(m - 1, n) + countUniquePathsRec(m, n - 1);
    }

    private int countUniquePathsMemo(int m, int n, int[] t) {
        if(m == 0 && n == 0) {
            return 1;
        }
        if(m < 0 || n < 0){
            return 0;
        }
        return countUniquePathsRec(m - 1, n) + countUniquePathsRec(m, n - 1);
    }

}
