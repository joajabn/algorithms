package pl.nyczjablonska.dynamicProgramming;

public class HouseRobber {
    public static int maxHouseRobbing(int[] array){
        return robHouse(array, 0, 0);
    }
    public static int robHouse(int[] array, int cost, int index) {
        if(index >= array.length){
            return cost;
        }
        int take = robHouse(array, cost + array[index], index + 2);
        int notTake = robHouse(array, cost, index + 1);
        return Math.max(take, notTake);
    }
}
