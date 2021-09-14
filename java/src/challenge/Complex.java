package challenge;

class Complex {
    double num1;
    String num2;

    public Complex(double num1, double num2) {
        this.num1 = num1;
        this.num2 = String.valueOf(num2) + "i";
    }

    public Complex(double num1) {
        this.num1 = num1;
        num2 = "0.0i";
    }

    public void print() {
        System.out.println((num1 + "+" + num2));
    }
}

class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}
