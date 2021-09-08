package chap02;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        int sum=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num==-1) break;
            sum+=num;
        }
        System.out.println("결과:" + sum);
    }
}

