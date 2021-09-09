package chap04;

import java.util.Objects;
import java.util.Scanner;

public class page122 {
    public static void printStar(int i) {
        for (i = i; i != 0; i--) {
            System.out.print("*");
        }
    }

    public static String input(String name) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print(name + " : ");
        String n = stdIn.next();
        return n;
    }

    public static void whosWin(String x, String y) {
        if (Objects.equals(x, "r")) {
            if (Objects.equals(y, "s")) System.out.println("철수, 승!");
            else if (Objects.equals(y, "r")) System.out.println("무승부!");
            else if (Objects.equals(y, "p")) System.out.println("영희, 승!");
        } else if (Objects.equals(x, "s")) {
            if (Objects.equals(y, "p")) System.out.println("철수, 승!");
            else if (Objects.equals(y, "s")) System.out.println("무승부!");
            else if (Objects.equals(y, "r")) System.out.println("영희, 승!");
        } else if (Objects.equals(x, "p")) {
            if (Objects.equals(y, "r")) System.out.println("철수, 승!");
            else if (Objects.equals(y, "p")) System.out.println("무승부!");
            else if (Objects.equals(y, "s")) System.out.println("영희, 승!");
        }
    }

    public static void foo(String A, int B) {
        System.out.println(A + " " + B);
    }

    public static void foo(String A, int B, int C) {
        System.out.println(A + " " + B + " " + C);
    }

    public static void foo(String A) {
        System.out.println(A);
    }

    public static boolean isPrime(int x) {
            for (int i = 2;i<x;i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        /*
        System.out.print("철수 : ");
        String chul= stdIn.next();
        System.out.print("영희 : ");
        String young= stdIn.next();
        if(Objects.equals(chul, "r")){
            if(Objects.equals(young, "s")) System.out.println("철수, 승!");
            else if(Objects.equals(young, "r")) System.out.println("무승부!");
            else if(Objects.equals(young, "p")) System.out.println("영희, 승!");
        }
        else if(Objects.equals(chul, "s")) {
            if (Objects.equals(young, "p")) System.out.println("철수, 승!");
            else if (Objects.equals(young, "s")) System.out.println("무승부!");
            else if (Objects.equals(young, "r")) System.out.println("영희, 승!");
        }
        else if(Objects.equals(chul, "p")) {
            if (Objects.equals(young, "r")) System.out.println("철수, 승!");
            else if (Objects.equals(young, "p")) System.out.println("무승부!");
            else if (Objects.equals(young, "s")) System.out.println("영희, 승!");
        }
         */

        /*
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);
        */
        /*
        for (int i =1;i<=5;i++){
            printStar(i);
            System.out.println();
        }
         */
        /*
        foo("안녕", 1);
        foo("안녕하세요", 1, 2);
        foo("잘 있어");
         */
        System.out.print("양의 정수를 입력하세요 ");
        int num = new Scanner(System.in).nextInt();
        if (isPrime(num))
            System.out.println(num + "는 소수입니다.");
        else
            System.out.println(num + "는 소수가 아닙니다.");
    }
}

