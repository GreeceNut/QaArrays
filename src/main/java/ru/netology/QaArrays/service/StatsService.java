package ru.netology.QaArrays.service;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1;
    }

    public int getSumSales(long[] sales) {
        long sumSales = 0;
        for (long i : sales) {
            sumSales = sumSales + i;
        }
        return (int) sumSales;
    }

    public int getAverageSumSales(long[] sales) {
        long averageSumSales = getSumSales(sales);
        return (int) (averageSumSales / sales.length);
    }

    public int getLowAverageSumSales(long[] sales) {
        int lowAverageSumSales = 0;
        long averageSumSales = getAverageSumSales(sales);
        for (long i : sales) {
            if (i < averageSumSales) {
                lowAverageSumSales++;
            }
        }
        return lowAverageSumSales;
    }

    public int getHighAverageSumSales(long[] sales) {
        int highAverageSumSales = 0;
        long averageSumSales = getAverageSumSales(sales);
        for (long i : sales) {
            if (i > averageSumSales) {
                highAverageSumSales++;
            }
        }
        return highAverageSumSales;
    }

}