package challenge;

class Complex {
    double a;
    double b;

    public Complex(double x){
        a = x;
    }
    public Complex(double x, double y){
        a = x;
        b = y;
    }
    void print() {
        System.out.println(a + " + " + b+ "i");
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}
