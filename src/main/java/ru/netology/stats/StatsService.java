package ru.netology.stats;

public class StatsService {

    public long totalSum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long averageSum(long[] sales) {
        return totalSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long max = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= max) {
                max = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int whenSaleBelowAverage(long[] sales) {
        long averageSale = averageSum(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int whenSaleAboveAverage(long[] sales) {
        long averageSale = averageSum(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
