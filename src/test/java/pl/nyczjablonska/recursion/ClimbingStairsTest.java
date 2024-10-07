package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    private ClimbingStairs climbing = new ClimbingStairs();
    @Test
    public void shouldReturnNumberOfWays2(){
        //given
        int n = 2;

        //when
        int actualNumberOfWays = ClimbingStairs.dpClimbStairs(n);

        //then
        assertEquals(2, actualNumberOfWays);
    }
    @Test
    public void shouldReturnNumberOfWays3(){
        //given
        int n = 3;

        //when
        int actualNumberOfWays = ClimbingStairs.dpClimbStairs(n);

        //then
        assertEquals(3, actualNumberOfWays);
    }
}