package ua.opnu.util;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Product> products;
    public static List<Order> orders;
    public static List<Customer> customers;

    static {

        products = getProducts();
        customers = getCustomers();
        orders = getOrders();

        populateOrderProduct(1, 19);
        populateOrderProduct(1, 21);
        populateOrderProduct(1, 5);
        populateOrderProduct(2, 17);
        populateOrderProduct(2, 11);
        populateOrderProduct(2, 14);
        populateOrderProduct(2, 13);
        populateOrderProduct(3, 5);
        populateOrderProduct(3, 3);
        populateOrderProduct(3, 19);
        populateOrderProduct(3, 13);
        populateOrderProduct(3, 15);
        populateOrderProduct(4, 22);
        populateOrderProduct(4, 26);
        populateOrderProduct(4, 12);
        populateOrderProduct(5, 5);
        populateOrderProduct(6, 5);
        populateOrderProduct(6, 12);
        populateOrderProduct(7, 8);
        populateOrderProduct(7, 25);
        populateOrderProduct(7, 21);
        populateOrderProduct(7, 1);
        populateOrderProduct(7, 13);
        populateOrderProduct(7, 10);
        populateOrderProduct(8, 12);
        populateOrderProduct(8, 8);
        populateOrderProduct(9, 8);
        populateOrderProduct(10, 14);
        populateOrderProduct(10, 8);
        populateOrderProduct(11, 12);
        populateOrderProduct(11, 6);
        populateOrderProduct(11, 21);
        populateOrderProduct(11, 22);
        populateOrderProduct(11, 27);
        populateOrderProduct(11, 11);
        populateOrderProduct(12, 19);
        populateOrderProduct(12, 13);
        populateOrderProduct(12, 11);
        populateOrderProduct(12, 6);
        populateOrderProduct(13, 11);
        populateOrderProduct(13, 24);
        populateOrderProduct(13, 26);
        populateOrderProduct(13, 23);
        populateOrderProduct(14, 18);
        populateOrderProduct(15, 16);
        populateOrderProduct(15, 13);
        populateOrderProduct(15, 7);
        populateOrderProduct(16, 23);
        populateOrderProduct(16, 29);
        populateOrderProduct(16, 18);
        populateOrderProduct(16, 16);
        populateOrderProduct(16, 22);
        populateOrderProduct(16, 26);
        populateOrderProduct(17, 18);
        populateOrderProduct(17, 4);
        populateOrderProduct(18, 13);
        populateOrderProduct(18, 3);
        populateOrderProduct(18, 27);
        populateOrderProduct(18, 2);
        populateOrderProduct(19, 26);
        populateOrderProduct(19, 22);
        populateOrderProduct(19, 18);
        populateOrderProduct(19, 14);
        populateOrderProduct(19, 15);
        populateOrderProduct(19, 13);
        populateOrderProduct(20, 22);
        populateOrderProduct(21, 21);
        populateOrderProduct(21, 26);
        populateOrderProduct(22, 7);
        populateOrderProduct(22, 6);
        populateOrderProduct(23, 27);
        populateOrderProduct(23, 7);
        populateOrderProduct(23, 11);
        populateOrderProduct(23, 5);
        populateOrderProduct(24, 24);
        populateOrderProduct(24, 2);
        populateOrderProduct(24, 6);
        populateOrderProduct(24, 28);
        populateOrderProduct(24, 4);
        populateOrderProduct(25, 28);
        populateOrderProduct(25, 17);
        populateOrderProduct(25, 2);
        populateOrderProduct(25, 29);
        populateOrderProduct(25, 19);
        populateOrderProduct(26, 4);
        populateOrderProduct(27, 6);
        populateOrderProduct(27, 15);
        populateOrderProduct(27, 24);
        populateOrderProduct(28, 22);
        populateOrderProduct(28, 9);
        populateOrderProduct(29, 22);
        populateOrderProduct(30, 29);
        populateOrderProduct(30, 6);
        populateOrderProduct(30, 8);
        populateOrderProduct(31, 16);
        populateOrderProduct(31, 12);
        populateOrderProduct(31, 28);
        populateOrderProduct(32, 8);
        populateOrderProduct(32, 5);
        populateOrderProduct(33, 12);
        populateOrderProduct(33, 26);
        populateOrderProduct(33, 21);
        populateOrderProduct(33, 23);
        populateOrderProduct(33, 29);
        populateOrderProduct(33, 13);
        populateOrderProduct(34, 1);
        populateOrderProduct(34, 6);
        populateOrderProduct(34, 22);
        populateOrderProduct(34, 19);
        populateOrderProduct(34, 13);
        populateOrderProduct(34, 27);
        populateOrderProduct(35, 5);
        populateOrderProduct(35, 11);
        populateOrderProduct(35, 26);
        populateOrderProduct(35, 9);
        populateOrderProduct(36, 28);
        populateOrderProduct(36, 7);
        populateOrderProduct(37, 15);
        populateOrderProduct(37, 11);
        populateOrderProduct(38, 18);
        populateOrderProduct(38, 11);
        populateOrderProduct(38, 14);
        populateOrderProduct(38, 20);
        populateOrderProduct(38, 7);
        populateOrderProduct(39, 1);
        populateOrderProduct(39, 21);
        populateOrderProduct(40, 12);
        populateOrderProduct(40, 10);
        populateOrderProduct(40, 11);
        populateOrderProduct(40, 29);
        populateOrderProduct(40, 1);
        populateOrderProduct(41, 13);
        populateOrderProduct(41, 19);
        populateOrderProduct(41, 5);
        populateOrderProduct(41, 29);
        populateOrderProduct(41, 14);
        populateOrderProduct(41, 4);
        populateOrderProduct(42, 2);
        populateOrderProduct(43, 6);
        populateOrderProduct(44, 20);
        populateOrderProduct(44, 18);
        populateOrderProduct(44, 8);
        populateOrderProduct(44, 24);
        populateOrderProduct(44, 26);
        populateOrderProduct(44, 13);
        populateOrderProduct(45, 23);
        populateOrderProduct(45, 1);
        populateOrderProduct(45, 25);
        populateOrderProduct(45, 15);
        populateOrderProduct(46, 16);
        populateOrderProduct(46, 24);
        populateOrderProduct(46, 19);
        populateOrderProduct(46, 13);
        populateOrderProduct(46, 11);
        populateOrderProduct(47, 23);
        populateOrderProduct(47, 28);
        populateOrderProduct(47, 20);
        populateOrderProduct(47, 21);
        populateOrderProduct(48, 15);
        populateOrderProduct(48, 3);
        populateOrderProduct(48, 26);
        populateOrderProduct(48, 7);
        populateOrderProduct(48, 19);
        populateOrderProduct(48, 10);
        populateOrderProduct(49, 5);
        populateOrderProduct(49, 13);
        populateOrderProduct(49, 29);
        populateOrderProduct(49, 3);
        populateOrderProduct(49, 12);
        populateOrderProduct(49, 17);
        populateOrderProduct(50, 15);
        populateOrderProduct(50, 16);
    }

    public static List<Product> getProducts() {

        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "omnis quod consequatur", "Games", 184.83));
        list.add(new Product(2, "vel libero suscipit", "Toys", 12.66));
        list.add(new Product(3, "non nemo iure", "Grocery", 498.02));
        list.add(new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80));
        list.add(new Product(5, "animi cum rem", "Games", 458.20));
        list.add(new Product(6, "dolorem porro debitis", "Toys", 146.52));
        list.add(new Product(7, "aspernatur rerum qui", "Books", 656.42));
        list.add(new Product(8, "deleniti earum et", "Baby", 41.46));
        list.add(new Product(9, "voluptas ut quidem", "Books", 697.57));
        list.add(new Product(10, "eos sed debitis", "Baby", 366.90));
        list.add(new Product(11, "laudantium sit nihil", "Toys", 95.50));
        list.add(new Product(12, "ut perferendis corporis", "Grocery", 302.19));
        list.add(new Product(13, "sint voluptatem ut", "Toys", 295.37));
        list.add(new Product(14, "quos sunt ipsam", "Grocery", 534.64));
        list.add(new Product(15, "qui illo error", "Baby", 623.58));
        list.add(new Product(16, "aut ex ducimus", "Books", 551.39));
        list.add(new Product(17, "accusamus repellendus minus", "Books", 240.58));
        list.add(new Product(18, "aut accusamus quia", "Baby", 881.38));
        list.add(new Product(19, "doloremque incidunt sed", "Games", 988.49));
        list.add(new Product(20, "libero omnis velit", "Baby", 177.61));
        list.add(new Product(21, "consectetur cupiditate sunt", "Toys", 95.46));
        list.add(new Product(22, "itaque ea qui", "Baby", 677.78));
        list.add(new Product(23, "non et nulla", "Grocery", 70.49));
        list.add(new Product(24, "veniam consequatur et", "Books", 893.44));
        list.add(new Product(25, "magnam adipisci voluptate", "Grocery", 366.13));
        list.add(new Product(26, "reiciendis consequuntur placeat", "Toys", 359.27));
        list.add(new Product(27, "dolores ipsum sit", "Toys", 786.99));
        list.add(new Product(28, "ut hic tempore", "Toys", 316.09));
        list.add(new Product(29, "quas quis deserunt", "Toys", 772.78));
        list.add(new Product(30, "excepturi nesciunt accusantium", "Toys", 911.46));

        return list;
    }

    public static List<Customer> getCustomers() {

        List<Customer> list = new ArrayList<>();

        list.add(new Customer(1, "Stefan Walker", 1));
        list.add(new Customer(2, "Daija Von", 1));
        list.add(new Customer(3, "Ariane Rodriguez", 1));
        list.add(new Customer(4, "Marques Nikolaus", 2));
        list.add(new Customer(5, "Rachelle Greenfelder", 0));
        list.add(new Customer(6, "Larissa White", 2));
        list.add(new Customer(7, "Fae Heidenreich", 1));
        list.add(new Customer(8, "Dino Will", 2));
        list.add(new Customer(9, "Eloy Stroman", 1));
        list.add(new Customer(10, "Brisa Connell", 1));

        return list;
    }

    public static List<Order> getOrders() {

        List<Order> list = new ArrayList<>();

        list.add(new Order(1, "2021-02-28", "2021-03-08", "NEW", getCustomerFromId(5)));
        list.add(new Order(2, "2021-02-28", "2021-03-05", "NEW", getCustomerFromId(3)));
        list.add(new Order(3, "2021-04-10", "2021-04-18", "DELIVERED", getCustomerFromId(5)));
        list.add(new Order(4, "2021-03-22", "2021-03-27", "PENDING", getCustomerFromId(3)));
        list.add(new Order(5, "2021-03-04", "2021-03-12", "NEW", getCustomerFromId(1)));
        list.add(new Order(6, "2021-03-30", "2021-04-07", "DELIVERED", getCustomerFromId(9)));
        list.add(new Order(7, "2021-03-05", "2021-03-09", "PENDING", getCustomerFromId(8)));
        list.add(new Order(8, "2021-03-27", "2021-04-05", "NEW", getCustomerFromId(4)));
        list.add(new Order(9, "2021-04-14", "2021-04-18", "NEW", getCustomerFromId(10)));
        list.add(new Order(10, "2021-03-10", "2021-03-19", "NEW", getCustomerFromId(8)));
        list.add(new Order(11, "2021-04-01", "2021-04-04", "DELIVERED", getCustomerFromId(1)));
        list.add(new Order(12, "2021-02-24", "2021-02-28", "PENDING", getCustomerFromId(5)));
        list.add(new Order(13, "2021-03-15", "2021-03-21", "NEW", getCustomerFromId(5)));
        list.add(new Order(14, "2021-03-30", "2021-04-07", "PENDING", getCustomerFromId(4)));
        list.add(new Order(15, "2021-03-13", "2021-03-14", "DELIVERED", getCustomerFromId(5)));
        list.add(new Order(16, "2021-03-13", "2021-03-21", "NEW", getCustomerFromId(1)));
        list.add(new Order(17, "2021-03-31", "2021-03-31", "DELIVERED", getCustomerFromId(6)));
        list.add(new Order(18, "2021-03-25", "2021-03-31", "PENDING", getCustomerFromId(9)));
        list.add(new Order(19, "2021-02-28", "2021-03-09", "DELIVERED", getCustomerFromId(9)));
        list.add(new Order(20, "2021-03-23", "2021-03-30", "NEW", getCustomerFromId(5)));
        list.add(new Order(21, "2021-03-19", "2021-03-24", "DELIVERED", getCustomerFromId(9)));
        list.add(new Order(22, "2021-02-27", "2021-03-01", "NEW", getCustomerFromId(5)));
        list.add(new Order(23, "2021-04-19", "2021-04-24", "PENDING", getCustomerFromId(4)));
        list.add(new Order(24, "2021-03-24", "2021-03-24", "DELIVERED", getCustomerFromId(1)));
        list.add(new Order(25, "2021-03-03", "2021-03-10", "NEW", getCustomerFromId(1)));
        list.add(new Order(26, "2021-03-17", "2021-03-26", "NEW", getCustomerFromId(10)));
        list.add(new Order(27, "2021-03-20", "2021-03-25", "NEW", getCustomerFromId(1)));
        list.add(new Order(28, "2021-04-09", "2021-04-16", "DELIVERED", getCustomerFromId(2)));
        list.add(new Order(29, "2021-04-06", "2021-04-08", "PENDING", getCustomerFromId(1)));
        list.add(new Order(30, "2021-04-19", "2021-04-20", "DELIVERED", getCustomerFromId(1)));
        list.add(new Order(31, "2021-03-03", "2021-03-04", "NEW", getCustomerFromId(3)));
        list.add(new Order(32, "2021-03-15", "2021-03-24", "DELIVERED", getCustomerFromId(2)));
        list.add(new Order(33, "2021-04-18", "2021-04-24", "PENDING", getCustomerFromId(1)));
        list.add(new Order(34, "2021-03-28", "2021-03-28", "NEW", getCustomerFromId(6)));
        list.add(new Order(35, "2021-03-15", "2021-03-17", "NEW", getCustomerFromId(1)));
        list.add(new Order(36, "2021-03-04", "2021-03-08", "DELIVERED", getCustomerFromId(2)));
        list.add(new Order(37, "2021-03-18", "2021-03-25", "NEW", getCustomerFromId(8)));
        list.add(new Order(38, "2021-04-11", "2021-04-20", "NEW", getCustomerFromId(8)));
        list.add(new Order(39, "2021-04-12", "2021-04-17", "NEW", getCustomerFromId(9)));
        list.add(new Order(40, "2021-03-12", "2021-03-12", "PENDING", getCustomerFromId(3)));
        list.add(new Order(41, "2021-02-24", "2021-02-26", "NEW", getCustomerFromId(5)));
        list.add(new Order(42, "2021-04-08", "2021-04-14", "DELIVERED", getCustomerFromId(9)));
        list.add(new Order(43, "2021-03-03", "2021-03-11", "NEW", getCustomerFromId(3)));
        list.add(new Order(44, "2021-03-12", "2021-03-14", "DELIVERED", getCustomerFromId(4)));
        list.add(new Order(45, "2021-04-01", "2021-04-06", "DELIVERED", getCustomerFromId(1)));
        list.add(new Order(46, "2021-03-16", "2021-03-22", "NEW", getCustomerFromId(10)));
        list.add(new Order(47, "2021-04-07", "2021-04-12", "PENDING", getCustomerFromId(2)));
        list.add(new Order(48, "2021-04-05", "2021-04-06", "NEW", getCustomerFromId(2)));
        list.add(new Order(49, "2021-04-10", "2021-04-13", "NEW", getCustomerFromId(7)));
        list.add(new Order(50, "2021-03-18", "2021-03-21", "NEW", getCustomerFromId(9)));

        return list;
    }

    private static Customer getCustomerFromId(int id) {
        return customers.stream().filter(i -> i.getId() == id).findFirst().get();
    }

    private static void populateOrderProduct(int orderId, int productId) {

        Order o = orders.stream().filter(i -> i.getId() == orderId).findFirst().get();
        Product p = products.stream().filter(i -> i.getId() == productId).findFirst().get();

        o.addProduct(p);
        p.addOrder(o);
    }
}
