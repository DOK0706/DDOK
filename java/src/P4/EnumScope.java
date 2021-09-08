package P4;

import java.util.Scanner;

public class EnumScope {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수 A: ");
        int a = stdIn.nextInt();
        System.out.println("정수 B: ");
        int b = stdIn.nextInt();

        if (a > b) {    //a가 b보다 크면
            int t = a;
            a = b;
            b = t;
        }
    }
}
