package pl.nyczjablonska.recursion;

public class ClimbingStairs {
    public static int climbStairs(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

}
