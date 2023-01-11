package proxyDisaignPattern;

public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("mmd");
        access.grantInternetAccess();
    }
}
