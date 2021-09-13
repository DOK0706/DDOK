package chap04;

class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double color) {
//        this.radius = radius;

        this(color, "초록");
    }

    public Circle(String color) {
        radius = 4.0;
        this.color = color;
    }

    public Circle() {

    }

    void print() {
        System.out.println(radius + " 반지름을 가진 " + color + "색 공!");
    }
}


public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 5.0;
        c1.color = "빨강";

        c1.print();

        Circle c2 = new Circle(10.0, "노랑");
        c2.print();

        Circle c3 = new Circle(7.0, "하늘");
        c3.print();

        Circle c4 = new Circle("회");
        c4.print();
    }
}

