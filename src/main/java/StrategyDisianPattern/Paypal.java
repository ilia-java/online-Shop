package StrategyDisianPattern;

public class Paypal implements Payment{
    private String emailId;
    private String password;

    public Paypal(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amont) {
        System.out.println(amont + "using with paypal");
    }
}
