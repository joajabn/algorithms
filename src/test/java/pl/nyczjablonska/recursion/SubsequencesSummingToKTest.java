package pl.nyczjablonska.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequencesSummingToKTest {
    @Test
    public void shouldReturn3() {
        //given
        int[] arr = {1, 2, 3, 4, 2};
        int k = 4;

        //when
        int actual = SubsequencesSummingToK.count(arr, k);

        //then
        assertEquals(3, actual);
    }
    @Test
    public void shouldReturn2() {
        //given
        int[] arr = {1, 2, 3};
        int k = 3;

        //when
        int actual = SubsequencesSummingToK.count(arr, k);

        //then
        assertEquals(2, actual);
    }
    @Test
    public void shouldReturn5() {
        //given
        int[] arr = {1, 2, 3, 5, 4, 6};
        int k = 12;

        //when
        int actual = SubsequencesSummingToK.count(arr, k);

        //then
        assertEquals(5, actual);
    }
}