package products;

import java.util.List;

public class Phone extends Attributes {
      protected int size;
    protected int CameraVersion;
    protected int IosVersion;

    public Phone(String color, String brand, int productYear, int size, int cameraVersion, int iosVersion) {
        super(color, brand, productYear);
        this.size = size;
        CameraVersion = cameraVersion;
        IosVersion = iosVersion;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "size=" + size +
                ", CameraVersion=" + CameraVersion +
                ", IosVersion=" + IosVersion +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", productYear=" + productYear +
                '}';
    }
}
