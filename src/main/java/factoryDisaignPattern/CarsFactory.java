package factoryDisaignPattern;

public class CarsFactory {
   public Cars createCars(String NumberOfCar){
       if (NumberOfCar==null){
           return null;
       } else if (NumberOfCar.equals("bmw")) {
           return new BMW();
           
       } else if (NumberOfCar.equals("benz")) {
           return new Benz();
       }
   return null;}
}
