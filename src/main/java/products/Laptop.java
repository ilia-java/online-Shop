package products;

public class Laptop extends Attributes {
    protected int size;
    protected String model;
    protected int cpu;


    public Laptop(String color, String brand, int productYear,int size,String model,int cpu) {
        super(color, brand, productYear);
        this.size=size;
        this.cpu=cpu;
        this.model=model;

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "size=" + size +
                ", model='" + model + '\'' +
                ", cpu=" + cpu +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", productYear=" + productYear +
                '}';
    }
}
