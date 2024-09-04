package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {
    private final MinCostClimbingStairs minCost = new MinCostClimbingStairs();

    @Test
    public void shouldReturn15() {
        //given
        int[] costs = {10, 15, 20};

        //when
        int actual = minCost.minCostClimbingStairs(costs);

        //then
        assertEquals(15, actual);
    }
    @Test
    public void shouldReturn6() {
        //given
        int[] costs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        //when
        int actual = minCost.minCostClimbingStairs(costs);

        //then
        assertEquals(6, actual);
    }
}