package chap02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

//        if(num>=90) System.out.println("A");
//
//        else if(num>=80) System.out.println("B");
//
//        else if(num>=70) System.out.println("C");
//
//        else if(num>=60) System.out.println("D");
//
//        else if(num<59) System.out.println("F");

        switch (num/10) {
            case 9: System.out.println("A"); break;
            case 8: System.out.println("B"); break;
            case 7: System.out.println("C"); break;
            case 6: System.out.println("D"); break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0: System.out.println("F"); break;
        }
    }
}
