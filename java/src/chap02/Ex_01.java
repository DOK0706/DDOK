package chap02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

//        if(num%2==0) System.out.println("짝수입니다");
//
//        else System.out.println("홀수입니다");


//        if(num%3==0) System.out.println("3의 배수입니다");
//
//        else System.out.println("3의 배수가 아닙니다");

        if(num%3==0 && num%5==0) System.out.println("3의 배수이자 5의 배수 입니다");

        else System.out.println("3의 배수이자 5의 배수가 아닙니다");

    }
}
