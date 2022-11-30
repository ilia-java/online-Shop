package products;

public class Keyboard extends Attributes{

    protected int numberOfButtons;


    public Keyboard(String color, String brand, int productYear, int numberOfButtons) {
        super(color, brand, productYear);
        this.numberOfButtons = numberOfButtons;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", productYear=" + productYear +'\'' +
                ",NumberOfButtons='"+numberOfButtons+
                '}';
    }
}
