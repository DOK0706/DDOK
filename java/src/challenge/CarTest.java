package challenge;

class Car {
    static int Cars = 0;
    static int redCars = 0;
    String color;

    public Car(String color) {
        this.color = color;
        Cars++;
        if (color.equals("red") || color.equals("RED")) redCars++;
    }

    static public int getNumOfCar() {
        return Cars;
    }
    static public int getNumOfRedCar() {
        return redCars;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", Car.getNumOfCar(),Car.getNumOfRedCar());
    }

}
