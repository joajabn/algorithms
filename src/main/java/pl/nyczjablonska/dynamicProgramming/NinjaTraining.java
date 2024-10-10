package pl.nyczjablonska.dynamicProgramming;

import java.util.Arrays;

public class NinjaTraining {
    public static int ninjaTraining(int[][] activityPerDayCost) {
       int[][] dp = new int[activityPerDayCost.length][activityPerDayCost[0].length];
       for(int[] t : dp){
           Arrays.fill(t, -1);
       }
       int maxCost = 0;
       for(int i = 0; i < activityPerDayCost[0].length; i++) {
           maxCost = Math.max(maxCost, calculateCost(activityPerDayCost, 0, i, dp));
       }
       return maxCost;

    }

    private static int calculateCost(int[][] t, int startRow, int startColumn, int[][] dp) {
        dp[0][0] = t[0][0];
        dp[0][1] = t[0][1];
        dp[0][2] = t[0][2];
        int lastMaxColumn = startColumn;
        int maxValueInRow = t[startRow][startColumn];
        for(int row = 1; row < t.length; row++) {
            for(int column = 0; column < t[row].length; column++) {
                    if(column == lastMaxColumn){
                        dp[row][column] = dp[row - 1][column];
                    } else {
                        dp[row][column] = maxValueInRow + t[row][column];
                    }
                }
            for(int i = 0; i < dp[row].length; i++) {
                if(dp[row][i] > maxValueInRow){
                    maxValueInRow = dp[row][i];
                    lastMaxColumn = i;
                }
            }
        }
        return maxValueInRow;
    }

}
