package chap04;

import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class page121 {
    public static void main(String[] args) {
        /*
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        if(n>=19) System.out.println("성년");
        else if (n<19) System.out.println("미성년");
        */
        /*
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        switch (n) {
            case 1:
                System.out.println("아주 잘했습니다"); break;
            case 2:
            case 3: System.out.println("잘헀습니다"); break;

            case 4:
            case 5:
            case 6:
                System.out.println("보통입니다"); break;
            default:
                System.out.println("노력해야겠습니다");
        }
         */
        /*
        Scanner stdIn = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            n = stdIn.nextInt();
            if (n % 2 == 0) sum = sum + n;
        } while (n > 0);
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
         */
        /*
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
        for (int a = 1; a != 21; a++){
            for (int b = 1; b != 21; b++) {
                for (int c = 1; c != 21; c++){
                    if ((a*a) + (b*b) == (c*c)) {System.out.printf("%d %d %d", a, b, c);
                        System.out.println();
                }
            }
        }
    }
}
}

