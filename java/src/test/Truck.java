package test;

public class Truck extends Car {
    int ton;

    @Override
    void show2() {
        System.out.println(carname + "는 " + ton + "톤을 실을 수 있다.");
    }
}
