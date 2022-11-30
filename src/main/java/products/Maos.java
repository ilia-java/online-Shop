package products;

public class Maos extends Attributes   {
 protected int speed;
    protected String powerConnection;

    public Maos(String color, String brand, int productYear, int speed, String powerConnection) {
        super(color, brand, productYear);
        this.speed = speed;
        this.powerConnection = powerConnection;
    }

    @Override
    public String toString() {
        return "Maos{" +
                "speed=" + speed +
                ", powerConnection='" + powerConnection + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", productYear=" + productYear +
                '}';
    }
}
