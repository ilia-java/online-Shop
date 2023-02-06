package StrategyDisianPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        Item item1=new Item("2233",65);
        Item item2=new Item("3322",2);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.pay(new Paypal("laiduaud2gmail.com","83585395395"));
        shoppingCart.pay(new CreditCard("mmad","344334","7704","ndkd9e32"));


    }
}
