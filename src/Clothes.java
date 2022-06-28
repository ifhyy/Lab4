public class Clothes {
    private String company;
    private String type;
    private int price;
    private int amountOfProducts;
    private String color;

    public Clothes(String company, String type, int price, int amountOfProducts, String color) {
        this.company = company;
        this.type = type;
        this.price = price;
        this.amountOfProducts = amountOfProducts;
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getAmountOfProducts() {
        return amountOfProducts;
    }

    public String getColor() {
        return color;
    }

}