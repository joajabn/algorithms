package pl.nyczjablonska.dynamicProgramming;

import java.util.Arrays;

public class HouseRobberII {
    public static int maxHouseRobbing(int[] array) {
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        int[] arrayWithoutFirst = Arrays.copyOfRange(array, 1, array.length);
        int[] arrayWithoutLast = Arrays.copyOfRange(array, 0, array.length - 1);
        return Math.max(robHouse(arrayWithoutFirst), robHouse(arrayWithoutLast));
    }

    public static int robHouse(int[] t){
        int length = t.length;
        int[] dp = new int[length];
        if(length == 1){
            return t[0];
        }
        dp[0] = t[0];
        dp[1] = Math.max(t[0], t[1]);
        for(int i = 2; i < length; i++){
            dp[i] = Math.max(t[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[length - 1];
    }
}
