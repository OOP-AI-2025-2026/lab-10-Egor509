package ua.opnu.util;

import java.util.HashSet;
import java.util.Set;

public class Product {
    private Integer id;
    private String name;
    private String category;
    private Double price;
    private Set<Order> orders;

    public Product(Integer id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;

        orders = new HashSet<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("id=");
        builder.append(id);
        builder.append(" name=");
        builder.append(name);
        builder.append(" category=");
        builder.append(category);
        builder.append(" price=");
        builder.append(price);
        builder.append(" orders=[" );
        orders.forEach(i -> {
            builder.append(i.getId());
            builder.append(", ");
        });
        builder.append("]" );

        return builder.toString();
    }
}
