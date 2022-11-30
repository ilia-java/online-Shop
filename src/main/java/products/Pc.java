package products;

public class Pc {
    private int size;
    private String model;
    private String color;
    private int cpu;
    private String brand;

    public Pc(int size, String model, String color, int cpu, String brand) {
        this.size = size;
        this.model = model;
        this.color = color;
        this.cpu = cpu;
        this.brand = brand;
    }

    public void searching() {
    }

    public void typing() {
    }

    public void processing() {

    }

    public void gameing() {
    }

    @Override
    public String toString() {
        return "Pc{" +
                "size=" + size +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cpu=" + cpu +
                ", brand='" + brand + '\'' +
                '}';
    }
}
