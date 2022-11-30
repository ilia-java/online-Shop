package products;

public class Tv extends Attributes {
    protected int size;
    protected String resolution;
    protected String powerControl;

    public Tv(String color, String brand, int productYear, int size, String resolution, String powerControl) {
        super(color, brand, productYear);
        this.size = size;
        this.resolution = resolution;
        this.powerControl = powerControl;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "size=" + size +
                ", resolution='" + resolution + '\'' +
                ", powerControl='" + powerControl + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", productYear=" + productYear +
                '}';
    }
}
