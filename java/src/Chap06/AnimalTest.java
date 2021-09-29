package Chap06;

public class AnimalTest {
    public static void main(String[] args) {
        Eagle e1 = new Eagle();
        e1.mouth = 1;
        e1.wing = 2;
        e1.eat();
        e1.fly();
        e1.sleep();

        Tiger t1 = new Tiger();
        t1.mouth = 1;
        t1.leg = 4;
        t1.eat();
        t1.run();
        t1.sleep();

        GoldFish f1 = new GoldFish();
        f1.mouth = 1;
        f1.fin = 5;
        f1.eat();
        f1.swim();
        f1.sleep();

    }
}