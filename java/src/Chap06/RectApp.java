package Chap06;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    public int getArea() {
        return width*height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Scanner stdIn = new Scanner(System.in);
        System.out.print("가로 입력: ");
        a.width = stdIn.nextInt();
        System.out.print("세로 입력: ");
        a.height = stdIn.nextInt();
        int r = a.getArea();
        System.out.println("가로는 "+a.width);
        System.out.println("세로는 "+a.height);
        System.out.println("넓이는 "+ r);
        System.out.println("r은 "+ r);
    }
}
