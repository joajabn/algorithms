package pl.nyczjablonska.recursion;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] costs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        MinCostClimbingStairs minCost = new MinCostClimbingStairs();
        System.out.println(minCost.minCostClimbingStairs(costs));
    }
    public int minCostClimbingStairs(int[] costs) {
//        return Math.min(climbStairs(costs, 0, 0 ), climbStairs(costs, 0, 1));
        return dpClimbStairs(costs);
    }

    private int climbStairs(int[] arr, int cost, int index) {
        if (index >= arr.length) {
            return cost;
        } else {
            int take1 = climbStairs(arr,cost + arr[index],index + 1);
            int take2 = climbStairs(arr, cost + arr[index],index + 2);
            return Math.min(take1, take2);
        }
    }

    private int recClimbStairs(int[] t, int index){
        if(index == 0 || index == 1){
            return t[index];
        }
        if(index == t.length - 1){
            int take1 = recClimbStairs(t, index - 1);
            int take2 = recClimbStairs(t, index - 2);
            return Math.min(take1, take2);
        } else {
            int take1 = t[index] + recClimbStairs(t, index - 1);
            int take2 = t[index] + recClimbStairs(t, index - 2);
            return Math.min(take1, take2);
        }
    }

    private int dpClimbStairs(int[] t){
        int length = t.length;
        int[] dp = new int[length];
        if(length == 1) {
            return t[0];
        }
        dp[0] = t[0];
        dp[1] = t[1];
        for(int i = 2; i < length; i++){
            if(i == length - 1){
                dp[i] = Math.min(dp[i - 1],t[i] + dp[i - 2]);
            } else {
                dp[i] = Math.min(t[i] + dp[i - 1], t[i] + dp[i - 2]);
            }
        }
        return dp[length - 1];
    }
}

