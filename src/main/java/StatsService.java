package ru.netology.DZ.Stats;

public class StatsService {

    public int sumSalesAll(int sales[]) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public int averageSumSalesAll(int sales[]) {
        int average = sumSalesAll(sales) / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int mmonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = mmonth;
            }
            mmonth = mmonth + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int qntMinSales(int[] sales) {
        int qntMinMonth = 0;
        for (int minSales : sales) {
            if (minSales < averageSumSalesAll(sales)) {
                qntMinMonth++;
            }
        }
        return qntMinMonth;
    }


    public int qntMaxSales(int[] sales) {
        int qntMaxMonth = 0;
        for (int maxSales : sales) {
            if (maxSales > averageSumSalesAll(sales)) {
                qntMaxMonth++;
            }
        }
        return qntMaxMonth;
    }
}


