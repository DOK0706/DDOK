package challenge;

import P8.Car;

import java.util.Locale;

class Car {
    String color;
    static private int cars = 0;
    static  private int redCars = 0;

    public Car(String color) {
        this.color = color;
        cars++;
        if (color.toLowerCase().equals("red")) redCars++;
    }

    static public int getNumOfCar() {
        return cars;
    }
    static public int getNumOfRedCar() {
        return redCars;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c1 = new Car("blue");
        Car c1 = new Car("RED");

        System.out.println("자동차 수: %d, 빨간색 자동차 수: %d", Car.getNumOfCar(),Car.getNumOfRedCar());
    }

}
