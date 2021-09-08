package chap02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int sum = 0, i = 0;

        for (i = 0; i != 5; i++) {
            int A = stdIn.nextInt();

            if (A < 0) continue;

            else sum = sum + A;
        }
        System.out.println(sum);
    }
}
