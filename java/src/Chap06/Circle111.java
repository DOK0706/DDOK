package Chap06;

public class Circle111{
    int r;
    int h;

    public Circle111(int r) {
        this.r = r;
    }

    public Circle111(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public double findArea() {
        return (Math.round(r*r*3.14));
    }
}