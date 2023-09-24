package org.example;

/**
 * Товар, базовый класс
 */
public abstract class product {
    /**
     * name - наименование
     * price - цена
     */
    private String name;
    private double price;

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product " +
                "name='" + name + '\'' +
                ", price=" + price;
    }
}

