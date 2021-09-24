package Chap06;

class Circle1 {
    int radius;
    void show() {
        System.out.println("반지름이 " + radius +"인 원이다.");
    }
}
class ColoredCircle1 extends Circle1{
    String color;
    void show() {
        System.out.println("반지름이 " + radius + "인 " + color +" 원이다.");
    }
}
public class Circle1Test {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.radius = 5;
        c.show();
        ColoredCircle1 C = new ColoredCircle1();
        C.radius = 10;
        C.color = "빨간색";
        C.show();
    }
}

