package chap07;

interface Controllable {
    void turnOn();
    void turnOff();

    default void repair() {
        System.out.println("장비를 수리한다");
    }
    static void reset() {
        System.out.println("장비 초기화");
    }
}

class TV implements Controllable {
    public void repair() {
        Controllable.super.repair();
    }
    public void turnOn() {
        System.out.println("TV를 켠다.");
    }
    public void turnOff() {
        System.out.println("TV를 끈다.");
    }
}

class Computer implements Controllable {
    public void repair() {
        Controllable.super.repair();
    }
    public void turnOn() {
        System.out.println("컴퓨터를 킨다.");
    }
    public void turnOff() {
        System.out.println("컴퓨터를 끈다.");
    }
}

public class ControllableDemo {
    public static void main(String[] args) {
        Controllable[] controllables = {new TV(), new Computer()};

        for(Controllable c:controllables) {
            c.turnOn();
            c.turnOff();
            c.repair();
        }
        Controllable.reset();
    }
}
