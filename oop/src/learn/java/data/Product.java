package learn.java.data;

import java.util.Objects;

public class Product {
    protected String name;
    protected int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }

    // ini auto generate
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }
}
