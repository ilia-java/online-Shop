package products;

import java.util.List;

public class Charger extends Attributes {
    @Override
    public String toString() {
        return "Charger{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", productYear=" + productYear +
                '}';
    }

    public Charger(String color, String brand, int productYear) {

        super(color, brand, productYear);

    }
}
