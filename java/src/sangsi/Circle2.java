package sangsi;

class Circle2 implements Shape {
    int ii;
    public Circle2(int i) {
        ii = i;
    }

    @Override
    public void draw() {
        System.out.println("반지름은 "+ ii + "입니다.");
    }

    @Override
    public double getArea() {
        return PI * ii * ii;
    }
}
