package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateArraySum() {
        StatsService run = new StatsService();
        long[] Sales = {400_000, 1500_000, 1300_000, 105_000, 1000_700, 2000_000, 2000_000, 1400_000, 108_000, 1000_000, 800_000, 900_000};
        long expected = 12_513_700;
        long actual = run.calculateArraySum(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAvgSales() {
        StatsService run = new StatsService();
        long[] Sales = {400_000, 1500_000, 1300_000, 105_000, 1000_700, 2000_000, 2000_000, 1400_000, 108_000, 1000_000, 800_000, 900_000};
        long expected = 1_042_808;
        long actual = run.calculateAvgValue(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSales() {
        StatsService run = new StatsService();
        long[] Sales = {400_000, 1500_000, 1300_000, 105_000, 1000_700, 2000_000, 2000_000, 1400_000, 108_000, 1000_000, 800_000, 900_000};
        int expected = 7;
        int actual = run.calculateMaxSales(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinSales() {
        StatsService run = new StatsService();
        long[] Sales = {400_000, 1500_000, 1300_000, 105_000, 1000_700, 2000_000, 2000_000, 1400_000, 108_000, 1000_000, 800_000, 900_000};
        int expected = 4;
        int actual = run.calculateMinSales(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateLowAvgSales() {
        StatsService run = new StatsService();
        long[] Sales = {400_000, 1500_000, 1300_000, 105_000, 1000_700, 2000_000, 2000_000, 1400_000, 108_000, 1000_000, 800_000, 900_000};
        int expected = 7;
        int actual = run.calculateLowAvgValue(Sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateUpAvgSales() {
        StatsService run = new StatsService();
        long[] Sales = {400_000, 1500_000, 1300_000, 105_000, 1000_700, 2000_000, 2000_000, 1400_000, 108_000, 1000_000, 800_000, 900_000};
        int expected = 5;
        int actual = run.calculateUpAvgValue(Sales);
        assertEquals(expected, actual);
    }
}