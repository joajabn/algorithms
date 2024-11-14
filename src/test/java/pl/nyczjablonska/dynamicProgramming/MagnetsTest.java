package pl.nyczjablonska.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagnetsTest {

    @Test
    public void shouldReturn24() {
        int[] magnets = {6, 10, 4};
        int money = 25;
        int actual = Magnets.maxMagnetsForMoney(magnets, money);
        assertEquals(24, actual);
    }
}