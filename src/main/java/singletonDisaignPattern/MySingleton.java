package singletonDisaignPattern;

public class MySingleton {
    private static  MySingleton ms = null;
    private MySingleton() {

    }
    public static MySingleton getInstance() {
        if (ms == null) {
            ms = new MySingleton();
        }
        return ms;
    }
    public void myMethod() {
    }
}

