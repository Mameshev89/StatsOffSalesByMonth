package ru.netology.stats;

public class StatsService {

    public int calculateArraySum(long[] sales) {
        int sum = 0;
        for (long number : sales) {
            sum += number;
        }
        return sum;
    }

    public int calculateAvgValue(long[] sales) {
        int avg = calculateArraySum(sales) / sales.length;
        return avg;
    }

    public int calculateMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int calculateLowAvgValue(long[] sales) {
        int avg = calculateArraySum(sales) / sales.length;
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int calculateUpAvgValue(long[] sales) {
        int avg = calculateArraySum(sales) / sales.length;
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}
