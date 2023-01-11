package observerDisaignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject sub=new Subject();
        new OctObserver(sub);
        new HexObserver(sub);
        Scanner scnr=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println(" Enter a number:");
            sub.setState(scnr.nextInt());
        }
    }
}
