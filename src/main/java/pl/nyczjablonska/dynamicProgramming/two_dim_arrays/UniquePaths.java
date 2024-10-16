package pl.nyczjablonska.dynamicProgramming.two_dim_arrays;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] t = new int[m][n];
        for(int[] row : t){
            Arrays.fill(row, -1);
        }
        return dpCountUniquePaths(m, n, t);
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

    private int countUniquePathsMemo(int m, int n, int[][] t) {
        if(m == 0 && n == 0) {
            return 1;
        }
        if(m < 0 || n < 0){
            return 0;
        }
        int left = t[m][n - 1];
        int top = t[m - 1][n];
        if(left != -1){
            return t[m][n-1];
        }
        if(top != -1){
            return t[m - 1][n];
        }
        return countUniquePathsRec(m - 1, n) + countUniquePathsRec(m, n - 1);
    }

    private int dpCountUniquePaths(int m, int n, int[][] t){
        for(int row = 0; row < m; row++){
            for(int column = 0; column < n; column++) {
                if(row == 0 || column == 0) {
                    t[row][column] = 1;
                } else {
                    t[row][column] = t[row - 1][column] + t[row][column - 1];
                }
            }
        }
        return t[m - 1][n - 1];
    }
}
