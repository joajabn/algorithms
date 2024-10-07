package pl.nyczjablonska.recursion;

public class ClimbingStairs {
    public static int climbStairs(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int dpClimbStairs(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
