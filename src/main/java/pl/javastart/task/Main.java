package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("mleko", "produkt mleczny", 12.23, "nabiał");
        Product product2 = new Product("baton", "produkt słodki", 8, "słodycze");
        Product product3 = new Product("czekolada", 15.67);
        Product product4 = new Product("kurczak", "mięso - drób", 100, "mięso");

        Product[] productList = new Product[4];
        productList[0] = product1;
        productList[1] = product2;
        productList[2] = product3;
        productList[3] = product4;

        for (Product product : productList) {
            CalculateBrutto calculateBrutto = new CalculateBrutto(product);
            calculateBrutto.doCalculateBrutto(product);
            Product.showBruttoPrice(product.getName(), calculateBrutto.getPriceBrutto());
        }
    }
}