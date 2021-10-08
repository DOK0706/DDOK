package Chap06;

class Box {
    public Box() {
        System.out.println("오렌지");
    }
}

class ColoredBox extends Box {
    public ColoredBox() {
        System.out.println("사과");
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        ColoredBox cb = new ColoredBox();
    }
}
