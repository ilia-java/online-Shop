package factoryDisaignPattern;

public class Main {
    public static void main(String[] args) {
        CarsFactory carsFactory = new CarsFactory();
        Cars bmw = carsFactory.createCars("bmw");
        bmw.carsModel();
        Cars benz = carsFactory.createCars("benz");
        benz.carsModel();
     }
  }
