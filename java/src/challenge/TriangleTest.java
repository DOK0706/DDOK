package challenge;

class Triangle {
    double x;
    double y;

    public Triangle(double v, double v1) {
        x = v;
        y= v1;
    }

    double findArea() {
        return x * y / 2;
    }

    int isSameArea(Triangle t) {
        if(t.findArea() == findArea() ) return 1;
        else return 0;
    }
}

//public class TriangleTest {
//    public static void main(String[] args) {
//        Triangle t = new Triangle(10.0, 5.0);
//        System.out.println(t.findArea());
//    }
//}
public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
