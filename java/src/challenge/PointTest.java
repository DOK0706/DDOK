package challenge;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(5, 5);
        MovablePoint m = new MovablePoint(5, 5,10,10);
        System.out.println(p.toString());
        System.out.println(m.toString());
    }
}
