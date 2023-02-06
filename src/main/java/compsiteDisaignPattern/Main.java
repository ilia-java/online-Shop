package compsiteDisaignPattern;

import fasadDisaignPattern.Dayere;

public class Main {
    public static void main(String[] args) {
        Shape m1=new Triangle();
        Shape m2=new Triangle();
        Shape d1=new Circle();
        Drawing drawere=new Drawing();
        drawere.add(m1);
        drawere.add(d1);
        drawere.add(m2);
        drawere.draw("Red");
        drawere.add(m1);
        drawere.add(d1);
        drawere.draw("Green");

    }
}
