package EnumExercise;

public enum ProductType {
    FRUITS("Fruits","001F"),SWEETS("Sweets", "001S"),VEGETABLES("Veggies","001V");
    private String product;
    private String code;

    ProductType(String product, String code) {
        this.product = product;
        this.code = code;
    }
}
