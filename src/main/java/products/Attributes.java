package products;

import java.util.List;

public class Attributes {
    protected String color;

    protected String brand;
    protected int productYear;



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }


    public Attributes(String color, String brand, int productYear) {
        this.color = color;
        this.brand = brand;
        this.productYear = productYear;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", productYear=" + productYear +
                '}';
    }
}

