package products;

public class Hansfari extends Attributes {
    private int SoundPower;

    public Hansfari(String color, String brand, int productYear, int soundPower) {
        super(color, brand, productYear);

        this.SoundPower = soundPower;
    }

    public String toString2() {
        return "Hansfari{" +
                "color:"+"\'" +super.color + "\'" +"\t"+
                "Brand:"+"\'" +super.brand + "\'" +"\t"+
                "ProductYear:"+"\'" +super.productYear +"\'"+"\t"+
                "SoundPower"+"\'" +SoundPower +"\'" +
                '}';
    }
}
