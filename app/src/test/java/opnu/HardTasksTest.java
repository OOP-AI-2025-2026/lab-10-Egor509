package opnu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.opnu.HardTasks;
import ua.opnu.util.Order;
import ua.opnu.util.Product;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HardTasksTest {

    public static HardTasks task;

    @BeforeAll
    static void setup() {
        task = new HardTasks();
    }

    @Test
    @DisplayName("getBooksWithPrice")
    public void test1() {

        // Метод повинен повертати товари з id 7, 9, 16, 17, 24

        List<Integer> expected = List.of(7, 9, 16, 17, 24);
        List<Integer> actual = task.getBooksWithPrice().stream().map(Product::getId).toList();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getOrdersWithBabyProducts")
    public void test2() {

        // Метод повинен повертати замовлення з id 3, 4, 7, 8, 9, 10, 11, 14, 16, 17, 19,
        // 20, 27, 28, 29, 30, 32, 34, 37, 38, 40, 44, 45, 47, 48, 50

        List<Integer> expected = List.of(3, 4, 7, 8, 9, 10, 11, 14, 16, 17, 19, 20, 27, 28, 29, 30, 32, 34, 37, 38, 40, 44, 45, 47, 48, 50);
        List<Integer> actual = task.getOrdersWithBabyProducts().stream().map(Order::getId).toList();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("applyDiscountToToys")
    public void test3() {

        // region Вірна відповідь
        // id та нова ціна товарів:
        // id=2 price=6.33
        // id=4 price=268.4
        // id=6 price=73.26
        // id=11 price=47.75
        // id=13 price=147.685
        // id=21 price=47.73
        // id=26 price=179.635
        // id=27 price=393.495
        // id=28 price=158.045
        // id=29 price=386.39
        // id=30 price=455.73
        // endregion

        Map<Integer, Double> expected = new HashMap<>();

        expected.put(2, 6.33);
        expected.put(4, 268.4);
        expected.put(6, 73.26);
        expected.put(11, 47.75);
        expected.put(13, 147.685);
        expected.put(21, 47.73);
        expected.put(26, 179.635);
        expected.put(27, 393.495);
        expected.put(28, 158.045);
        expected.put(29, 386.39);
        expected.put(30, 455.73);


        Map<Integer, Double> actual = task.applyDiscountToToys()
                .stream().collect(Collectors.toMap(
                        Product::getId, Product::getPrice
                ));
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getCheapestBook")
    public void test4() {

        // товар з id = 17

        int expected = 17;

        int actual = task.getCheapestBook().get().getId();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getRecentOrders")
    public void test5() {

        // id замовлень 23, 30, 33

        List<Integer> expected = List.of(23, 30, 33);

        List<Integer> actual = task.getRecentOrders().stream().map(Order::getId).toList();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getBooksStats")
    public void test6() {

        // count = 5, average = 607.880000, max = 893.440000, min = 240.580000, sum = 3039.400000

        DoubleSummaryStatistics stats = task.getBooksStats();
        assertEquals(5, stats.getCount());
        assertEquals(607.880000, stats.getAverage());
        assertEquals(893.440000, stats.getMax());
        assertEquals(240.580000, stats.getMin());
        assertEquals(3039.400000, stats.getSum());
    }

    @Test
    @DisplayName("getOrdersProductsMap")
    public void test7() {

        // region Вірна відповідь
        // 1 : 3
        // 2 : 4
        // 3 : 5
        // 4 : 3
        // 5 : 1
        // 6 : 2
        // 7 : 6
        // 8 : 2
        // 9 : 1
        // 10 : 2
        // 11 : 6
        // 12 : 4
        // 13 : 4
        // 14 : 1
        // 15 : 3
        // 16 : 6
        // 17 : 2
        // 18 : 4
        // 19 : 6
        // 20 : 1
        // 21 : 2
        // 22 : 2
        // 23 : 4
        // 24 : 5
        // 25 : 5
        // 26 : 1
        // 27 : 3
        // 28 : 2
        // 29 : 1
        // 30 : 3
        // 31 : 3
        // 32 : 2
        // 33 : 6
        // 34 : 6
        // 35 : 4
        // 36 : 2
        // 37 : 2
        // 38 : 5
        // 39 : 2
        // 40 : 5
        // 41 : 6
        // 42 : 1
        // 43 : 1
        // 44 : 6
        // 45 : 4
        // 46 : 5
        // 47 : 4
        // 48 : 6
        // 49 : 6
        // 50 : 2
        // endregion

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 3);
        expected.put(2, 4);
        expected.put(3, 5);
        expected.put(4, 3);
        expected.put(5, 1);
        expected.put(6, 2);
        expected.put(7, 6);
        expected.put(8, 2);
        expected.put(9, 1);
        expected.put(10, 2);
        expected.put(11, 6);
        expected.put(12, 4);
        expected.put(13, 4);
        expected.put(14, 1);
        expected.put(15, 3);
        expected.put(16, 6);
        expected.put(17, 2);
        expected.put(18, 4);
        expected.put(19, 6);
        expected.put(20, 1);
        expected.put(21, 2);
        expected.put(22, 2);
        expected.put(23, 4);
        expected.put(24, 5);
        expected.put(25, 5);
        expected.put(26, 1);
        expected.put(27, 3);
        expected.put(28, 2);
        expected.put(29, 1);
        expected.put(30, 3);
        expected.put(31, 3);
        expected.put(32, 2);
        expected.put(33, 6);
        expected.put(34, 6);
        expected.put(35, 4);
        expected.put(36, 2);
        expected.put(37, 2);
        expected.put(38, 5);
        expected.put(39, 2);
        expected.put(40, 5);
        expected.put(41, 6);
        expected.put(42, 1);
        expected.put(43, 1);
        expected.put(44, 6);
        expected.put(45, 4);
        expected.put(46, 5);
        expected.put(47, 4);
        expected.put(48, 6);
        expected.put(49, 6);
        expected.put(50, 2);

        Map<Integer, Integer> actual = task.getOrdersProductsMap();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getProductsByCategory")
    public void test8() {

        // region Вірна відповідь
        // Grocery : [3, 12, 14, 23, 25]
        // Toys : [2, 4, 6, 11, 13, 21, 26, 27, 28, 29, 30]
        // Games : [1, 5, 19]
        // Baby : [8, 10, 15, 18, 20, 22]
        // Books : [7, 9, 16, 17, 24]
        // endregion

        Map<String, List<Integer>> expected = new HashMap<>();
        expected.put("Grocery", List.of(3, 12, 14, 23, 25));
        expected.put("Toys", List.of(2, 4, 6, 11, 13, 21, 26, 27, 28, 29, 30));
        expected.put("Games", List.of(1, 5, 19));
        expected.put("Baby", List.of(8, 10, 15, 18, 20, 22));
        expected.put("Books", List.of(7, 9, 16, 17, 24));


        Map<String, List<Integer>> actual = task.getProductsByCategory();

        assertEquals(expected, actual);
    }

}