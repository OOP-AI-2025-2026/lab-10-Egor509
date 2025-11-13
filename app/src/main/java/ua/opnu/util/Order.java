package ua.opnu.util;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Order {

    private Integer id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Customer customer;
    private Set<Product> products;

    public Order(Integer id, String orderDate, String deliveryDate, String status, Customer customer) {
        this.id = id;
        this.orderDate = LocalDate.parse(orderDate);
        this.deliveryDate = LocalDate.parse(deliveryDate);
        this.status = status;
        this.customer = customer;
        products = new HashSet<>();
    }

    public Set<Product> getProducts() {
        return products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("id=");
        builder.append(id);
        builder.append(" orderDate=");
        builder.append(orderDate);
        builder.append(" deliveryDate=");
        builder.append(deliveryDate);
        builder.append(" status=");
        builder.append(status);
        builder.append(" customer_id=");
        builder.append(customer.getId());

        builder.append(" products=[" );
        products.forEach(i -> {
            builder.append(i.getId());
            builder.append(", ");
        });
        builder.append("]" );

        return builder.toString();
    }
}
