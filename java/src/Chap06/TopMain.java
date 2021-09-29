package Chap06;

class Top {
    public int a;
    public int b;
    public int sum(int x, int y) {
        return x+y;
    }
}

public class TopMain {
    public static void main(String[] args) {
        Top alpha = new Top();
        alpha.a = 100;
        alpha.b = 200;
        int s = alpha.sum(alpha.a, alpha.b);
        System.out.println("a는 "+alpha.a);
        System.out.println("b는 "+alpha.b);
        System.out.println("결과는 "+s);
        System.out.println("s는 "+ s);
    }
}
