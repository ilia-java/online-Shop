package StrategyDisianPattern;

public class Item {
    private String upcCode;
    private int price;

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }
}
