package singletonDisaignPattern;

import java.util.Scanner;

// age object bood , hamono bargardon
// agar objecte nabood , ye dooen new kon
public class Main {
    public static void main(String[] args) {
        MySingleton mySingleton=MySingleton.getInstance();
        mySingleton.myMethod();
    }
}



