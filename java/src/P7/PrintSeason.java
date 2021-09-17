package P7;

// 지정한 월의 계절을 표시하는 메서드

import java.util.Scanner;

class PrintSeason {
    //--- m월의 계절을 표시 ---//
    static void printScreen(int m) {
        switch (m) {
            case 3:
            case 4:
            case 5:
                System.out.print("봄");
            case 6:
            case 7:
            case 8:
                System.out.print("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.print("겨울");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int month;
        do {
            System.out.print("몇 월입니까(1~12): ");
            month = stdIn.nextInt();
        } while (month < 1 || month > 12);

        System.out.print("해당 월의 계절은 ");
        printScreen(month);
        System.out.println("입니다.");
    }
}
