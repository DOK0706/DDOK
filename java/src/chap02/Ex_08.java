package chap02;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while (true) {
            String s = stdIn.next();
            if (s.equals("exit")) break;
        }
        System.out.println("종료되었습니다");
    }
}