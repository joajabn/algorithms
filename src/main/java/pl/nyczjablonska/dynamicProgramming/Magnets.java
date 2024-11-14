package pl.nyczjablonska.dynamicProgramming;

public class Magnets {
    public static int maxMagnetsForMoney(int[] magnets, int money) {
        int[][] dp = new int[magnets.length][money];
        for (int i = 0; i < magnets.length; i++) {
            int magnetValue = magnets[i];
            for (int j = 0; j < money; j++) {
                if (i == 0) {
                    if (magnetValue > j + 1) {
                        dp[i][j] = 0;
                    } else {
                        int counter = (j + 1) / magnetValue;
                        dp[i][j] = counter * magnetValue;
                    }
                } else {
                    if (magnetValue > j + 1) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        int rest = 0;
                        int previousResultForJ = dp[i - 1][j];
                        if ((j + 1) - magnetValue > 0) {
                            rest = dp[i - 1][j - magnetValue];
                        }
                        dp[i][j] = Math.max(magnetValue + rest, previousResultForJ);
                    }
                }
            }
        }
        return dp[magnets.length - 1][money - 1];

//        int[][] dp = new int[magnets.length][money + 1];
//        for (int i = 0; i < money + 1; i++) {
//            if (magnets[0] <= i) {
//                dp[0][i] = magnets[0] * (i / magnets[0]);
//            }
//        }
//        for (int i = 1; i < magnets.length; i++) {
//            for (int j = 0; j < money + 1; j++) {
//                int take = 0;
//                if (magnets[i] <= j) {
//                    take = magnets[i] + dp[i][j - magnets[i]];
//                }
//                int nonTake = dp[i - 1][j];
//                dp[i][j] = Math.max(take, nonTake);
//            }
//        }
//        return dp[magnets.length - 1][money];
    }

}
