package EnumExercise;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ProductService {
    @Getter
    private List<Product>products = new ArrayList<>();

    public void addProduct (Product product){
        products.add(product);
    }
    public List<Product> retrieveFruits(ProductType productType){
        return products.stream()
                .filter(p -> p.getProductType().equals(productType))
                .collect(toList());

    }
    public List<Product> getProducts() {
        return products;
    }
}
