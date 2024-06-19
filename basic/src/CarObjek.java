 class Car {
    String color;
    int year;

   void displayCar(){
       System.out.println("Color: " + color + " Year: " + year);
   }
}


public class CarObjek {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.year = 2019;
        car.displayCar();
    }
}
