package products;

import java.util.List;

public class Charger extends Attributes {
    protected  int id;

    public Charger(int id,String color, String brand, int productYear) {
        super(color, brand, productYear);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Charger{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", productYear=" + productYear +
                '}';
    }
}
