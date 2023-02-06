package builderDisaignPattern;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer.ComputerBuilder("500 GB","8 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        //خروجی ندارع ولی من همون کد رو زدم قثط اسماشو جابجا کردم

    }
}
