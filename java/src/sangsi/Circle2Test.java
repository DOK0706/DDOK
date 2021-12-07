package sangsi;

interface Shape {
    final double PI = 3.14;

    void draw();

    double getArea();

    default public void redraw() {
        System.out.println("다시 그림을 그립니다.");
        draw();
    }
}

public class Circle2Test {
    public static void main(String[] args) {
        Shape donut = new Circle2(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}
