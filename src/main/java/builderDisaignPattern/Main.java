package builderDisaignPattern;

public class Main {
    public static void main(String[] args) {
        Computer pc=new Computer.ComputerBuilder("500 GB","8 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        System.out.println("hdd = " );
    }
}
