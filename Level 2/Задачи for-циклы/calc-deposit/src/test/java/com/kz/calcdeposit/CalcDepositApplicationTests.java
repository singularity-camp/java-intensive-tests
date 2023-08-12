package com.kz.calcdeposit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalcDepositApplicationTests {

    @Test
    void test() {
        assertEquals(1050.0, CalcDeposit.calc(1, 5, 1000), 0.001);
        assertEquals(37129.3, CalcDeposit.calc(5, 30, 10000), 0.001);
        assertEquals(856228.917800925, CalcDeposit.calc(12, 99, 222), 0.001);
        assertEquals(1183.166281638568, CalcDeposit.calc(12, 1, 1050), 0.001);
        assertEquals(7011.71875, CalcDeposit.calc(3, 25, 3590), 0.001);
        assertEquals(1902.1162111875, CalcDeposit.calc(3, 15.5, 1234.5), 0.001);
        assertEquals(5698.395062603815, CalcDeposit.calc(10, 33.3, 321.7), 0.001);
        assertEquals(12744.777601, CalcDeposit.calc(2, 23.7, 8329), 0.001);
        assertEquals(60727.43261676884, CalcDeposit.calc(5, 95.6, 2121), 0.001);
        assertEquals(3706.864735491574, CalcDeposit.calc(9, 37.5, 211), 0.001);
        assertEquals(240413.0256900885, CalcDeposit.calc(11, 12, 69113), 0.001);
    }

}
