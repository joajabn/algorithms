package pl.nyczjablonska.dynamicProgramming;

public class Knapsack {
    public static int knapsackNoRowOrColumn(int[][] items, int weightOfBags) {
        int[][] dp = new int [items.length][weightOfBags];
        for(int i = 0; i < items.length; i++) {
            int itemWeight = items[i][0];
            int itemValue = items[i][1];
            for(int j = 0; j < weightOfBags; j++) {
                int weight = j + 1;
                if(i == 0) {
                    if(weight < itemWeight) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = itemValue;
                    }
                } else {
                    if(weight < itemWeight) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        int rest = 0;
                        int previousResultForThisWeight = dp[i - 1 ][j];
                        if((j + 1) - itemWeight > 0) {
                            rest = dp[i - 1][j - itemWeight];
                        }
                        dp[i][j] = Math.max(itemValue + rest, previousResultForThisWeight);
                    }
                }
            }
        }
        return dp[items.length - 1][weightOfBags - 1];
    }

    public static int knapsack(int[][] items, int weightOfBag) {
        int[][] dp = new int[items.length + 1][weightOfBag + 1];
        for(int i = 1; i < items.length + 1; i++) {
            int itemWeight = items[i - 1][0];
            int itemValue = items[i - 1][1];
            for(int j = 1; j < weightOfBag + 1; j++) {
                if(j < itemWeight) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(itemValue + dp[i - 1][j - itemWeight], dp[i - 1][j]);
                }
            }
        }
        return dp[items.length][weightOfBag];
    }
}
