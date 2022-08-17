
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ru.netology.DZ.Stats.StatsService;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSalesAll(sales);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAvg = 15;
        double actualAvg = service.averageSumSalesAll(sales);

        assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void findMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void findMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minSales(sales);

        assertEquals(expectedMin, expectedMin);
    }

    @Test
    public void findQuantityMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinQnt = 5;
        int actualMinQnt = service.qntMinSales(sales);

        assertEquals(expectedMinQnt, actualMinQnt);
    }

    @Test
    public void findQuantityMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxQnt = 5;
        int actualMaxQnt = service.qntMaxSales(sales);

        assertEquals(expectedMaxQnt, actualMaxQnt);
    }
}



