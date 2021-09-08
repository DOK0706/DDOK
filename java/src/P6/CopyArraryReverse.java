package P6;

import java.util.Scanner;

public class CopyArraryReverse {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수: ");
        int n = stdIn.nextInt();    //요소 수 읽기
        int[] a = new int[n];        //배열 a 생성
        int[] b = new int[n];        //배열 b 생성

        for (int i = 0; i < n; i++) {      //배열에 a 값 읽기
            System.out.print("a[" + i + "]=");
            a[i] = stdIn.nextInt();
        }

        //배열 a의 모든 요소를 역순으로 배열 b에 복사
        for (int i = 0; i < n; i++) {
            b[i] = a[n - i - 1];
        }

        System.out.println("a의 모든 요소를 역순으로 복사했습니다.");

        for (int i = 0; i < n; i++) { //배열 b를 표시
            System.out.println("b[" + i + "]=" + b[i]);
        }
    }
}
