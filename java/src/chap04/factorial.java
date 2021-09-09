package chap04;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        /*int result;
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        result = 1;
        System.out.println(n);
        */
        /*
        while (n>0) {
            result = result * n;
            n--;
        }
         */
        /*
        while (true) {
            result = result * n;
            n--;
            if(n==0) break;
        }
        */
        /*
        result = factorial(n);
        System.out.println(result);
        */

        System.out.println(factorial(5));
        System.out.println(factorial(1, 5));
        System.out.println(factorial(3,5));
        System.out.println(factorial(10,5));
    }
    static int factorial(int x) {
        int r = 1;
        while (x > 0) {
            r = r * x;
            x--;
        }
        return r;
    }
    static int factorial(int x, int y){
        int r = 1;
        while (x<=y) {
           r = r*y; y--;
        }
        return r;
    }
}
