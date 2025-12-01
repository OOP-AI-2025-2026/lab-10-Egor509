package ua.opnu;

import ua.opnu.util.Customer;
import ua.opnu.util.DataProvider;
import ua.opnu.util.Order;
import ua.opnu.util.Product;

import java.util.*;
import java.util.stream.Collectors;

public class HardTasks {

    private final List<Customer> customers = DataProvider.customers;
    private final List<Order> orders = DataProvider.orders;
    private final List<Product> products = DataProvider.products;

    public static void main(String[] args) {
        HardTasks tasks = new HardTasks();

        System.out.println("--- Books > 100 ---");
        tasks.getBooksWithPrice().forEach(System.out::println);

        System.out.println("\n--- Orders with Baby products ---");
        tasks.getOrdersWithBabyProducts().forEach(System.out::println);

        System.out.println("\n--- Discounted Toys ---");
        tasks.applyDiscountToToys().forEach(System.out::println);

        System.out.println("\n--- Cheapest Book ---");
        tasks.getCheapestBook().ifPresent(System.out::println);

        System.out.println("\n--- Recent Orders ---");
        tasks.getRecentOrders().forEach(System.out::println);

        System.out.println("\n--- Books Stats ---");
        DoubleSummaryStatistics stats = tasks.getBooksStats();
        if (stats != null) {
            System.out.printf("count=%d, sum=%.2f, min=%.2f, average=%.2f, max=%.2f%n",
                    stats.getCount(), stats.getSum(), stats.getMin(), stats.getAverage(), stats.getMax());
        }

        System.out.println("\n--- Order ID : Product Count ---");
        tasks.getOrdersProductsMap().forEach((id, count) -> System.out.println(id + " : " + count));

        System.out.println("\n--- Products by Category ---");
        tasks.getProductsByCategory().forEach((cat, ids) -> System.out.println(cat + " : " + ids));
    }

    public List<Product> getBooksWithPrice() {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersWithBabyProducts() {
        return orders.stream()
                .filter(o -> o.getProducts().stream()
                        .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
                .collect(Collectors.toList());
    }

    public List<Product> applyDiscountToToys() {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                .map(p -> {
                    p.setPrice(p.getPrice() * 0.5);
                    return p;
                })
                .collect(Collectors.toList());
    }

    public Optional<Product> getCheapestBook() {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .min(Comparator.comparingDouble(Product::getPrice));
    }

    public List<Order> getRecentOrders() {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed()) // Сортуємо за датою (нові спочатку)
                .limit(3)
                .collect(Collectors.toList());
    }

    public DoubleSummaryStatistics getBooksStats() {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();
    }

    public Map<Integer, Integer> getOrdersProductsMap() {
        return orders.stream()
                .collect(Collectors.toMap(
                        Order::getId,
                        order -> order.getProducts().size()
                ));
    }

    public Map<String, List<Integer>> getProductsByCategory() {
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getId, Collectors.toList())
                ));
    }
}