package pl.javastart.task;

public class CalculateBrutto {
    private Product product;
    double priceBrutto;

    public CalculateBrutto(Product product) {
        this.product = product;
    }

    public double getPriceBrutto() {
        return priceBrutto;
    }

    public void doCalculateBrutto(Product product) {
        String category = product.getCategory();
        double priceNetto = product.getPriceNetto();
        double vat;

        vat = switch (category) {
            case "nabiał" -> 0.08;
            case "słodycze" -> 0.22;
            case null -> 0.50;
            default -> 0.23;
        };

        this.priceBrutto = priceNetto + priceNetto * vat;
    }
}
