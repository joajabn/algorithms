package pl.nyczjablonska.recursion;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] costs = {1,100,1,1,1,100,1,1,100,1};
        MinCostClimbingStairs minCost = new MinCostClimbingStairs();
        System.out.println(minCost.minCostClimbingStairs(costs));
    }
    public int minCostClimbingStairs(int[] costs) {
        return Math.min(climbStairs(costs, 0, 0 ), climbStairs(costs, 0, 1));
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
}

