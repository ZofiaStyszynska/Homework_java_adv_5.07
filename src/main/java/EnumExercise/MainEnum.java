package EnumExercise;

import java.util.ArrayList;
import java.util.List;

public class MainEnum {

    public static void main(String[] args) {

        ProductType [] productTypes = ProductType.values();

        for (ProductType products:productTypes){
            System.out.println(products.toString());

        }
        ProductService productService = new ProductService();
        List<Product> products = new ArrayList<>();
        productService.addProduct(new Product("Banana", 2.15, 0.23, ProductType.FRUITS));
        productService.addProduct(new Product("Chocolate",4.89,0.2,ProductType.SWEETS));
        productService.addProduct(new Product("Paprika",0.78,0.34,ProductType.VEGETABLES));
        System.out.println(productService.getProducts());
        List<Product> newProducts = productService.retrieveFruits(ProductType.SWEETS);

        System.out.println(newProducts);





}}
