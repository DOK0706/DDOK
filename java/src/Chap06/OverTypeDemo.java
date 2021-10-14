package Chap06;

class Vehicle1 {
    String name = "탈것";

    void whoami() {
        System.out.println("나는 탈 것입니다.");
    }

    static void move() {
        System.out.println("이동하다.");
    }
}

class Car1 extends Vehicle1 {
    String name = "자동차";
    void whoami() {
        System.out.println("나는 자동차이다.");
    }

    static void move() {
        System.out.println("달리다.");
    }
}

public class OverTypeDemo {
    public static void main(String[] args) {
        Vehicle1 v= new Car1();
        System.out.println(v.name);
        v.whoami();
        v.move();

        if(v instanceof Car1) {
            Car1 c = (Car1)v;
            System.out.println(c.name);
            c.whoami();
            c.move();
        }
    }
}
