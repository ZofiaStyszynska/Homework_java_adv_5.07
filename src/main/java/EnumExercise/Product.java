package EnumExercise;

import lombok.Getter;

import java.math.BigDecimal;
@Getter
public class Product {
    private final String name;
    private final double price;
    private final double weight;
    private final ProductType productType;

    public Product(String name, double price, double weight, ProductType productType) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", productType=" + productType;
    }
}
