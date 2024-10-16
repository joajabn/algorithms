package pl.nyczjablonska.dynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public static int maxHouseRobbing(int[] array) {
        int[] dp = new int[array.length];
        Arrays.fill(dp, -1);
        return dpRobHouse(array);
    }

    public static int robHouse(int[] array, int cost, int index) {
        if (index >= array.length) {
            return cost;
        }
        int take = cost + robHouse(array, cost + array[index], index + 2);
        int notTake = robHouse(array, cost, index + 1);
        return Math.max(take, notTake);
    }

    public static int memoRobHouse(int[] array, int index, int[] dp) {
        if (index < 0) {
            return 0; // Base case: no more houses to rob
        }

        if (dp[index] != -1) {
            return dp[index]; // Return already computed result
        }

        // Recurrence relation: max of robbing current house or skipping it
        int take = array[index] + memoRobHouse(array, index - 2, dp); // Rob current house
        int notTake = memoRobHouse(array, index - 1, dp); // Skip current house

        dp[index] = Math.max(take, notTake); // Store result in dp array
        return dp[index];
    }

    public static int dpRobHouse(int[] t){
        int length = t.length;
        if(length == 1){
            return t[0];
        }
        int[] dp = new int[length];
        dp[0] = t[0];
        dp[1] = Math.max(t[0], t[1]);
        for(int i = 2; i < length; i++){
            dp[i] = Math.max(t[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[length - 1];
    }
}
