package ru.netology.QaArrays.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test

    public void findMinMonth() {
        StatsService service = new StatsService();

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void findMaxMonth() {
        StatsService service = new StatsService();

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void findSumSales() {
        StatsService service = new StatsService();

        int expectedSum = 180;
        int actualSum = service.getSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findAverageSumSales() {
        StatsService service = new StatsService();

        int expectedAverage = 15;
        int actualAverage = service.getAverageSumSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void findLowAverageSumSales() {
        StatsService service = new StatsService();

        int expectedLow = 5;
        int actualLow = service.getLowAverageSumSales(sales);

        Assertions.assertEquals(expectedLow, actualLow);
    }

    @Test
    public void findHighAverageSumSales() {
        StatsService service = new StatsService();

        int expectedHigh = 5;
        int actualHigh = service.getHighAverageSumSales(sales);

        Assertions.assertEquals(expectedHigh, actualHigh);
    }
}