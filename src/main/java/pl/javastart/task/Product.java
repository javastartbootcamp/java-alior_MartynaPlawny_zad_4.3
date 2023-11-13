package pl.javastart.task;

public class Product {
    private String name;
    private String description;
    private double priceNetto;
    private String category;

    public Product(String name, String description, double priceNetto, String category) {
        this.name = name;
        this.description = description;
        this.priceNetto = priceNetto;
        this.category = category;
    }

    public Product(String name, double priceNetto) {
        this.name = name;
        this.priceNetto = priceNetto;
    }

    public String getName() {
        return name;
    }

    public double getPriceNetto() {
        return priceNetto;
    }

    public String getCategory() {
        return category;
    }

    public static void showBruttoPrice(String productName, double productBruttoPrice) {
        System.out.printf("Cena brutto produktu %s: %.2f\n", productName, productBruttoPrice);
    }
}

