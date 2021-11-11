package chap10;

import java.util.Scanner;

public class TryCatch1Demo {
    public static void main(String[] args) {
        int [] array = {0,1,2};
        Scanner s = new Scanner(System.in);
        System.out.print("몇 번째 숫자를 출력하시겠습니까? : ");
        int input = s.nextInt();

        try {
            System.out.println(array[input]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("원소가 존재하지 않는다.");
        }
        finally {
            System.out.println("여긴 마량");
        }
    }
}

