package chap10;

class chap10 extends RuntimeException {}

public class Except {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("에러 발생");
        }

        try {
            throw new Error();
        } catch (Error e) {
            System.out.println("Error 에러 발생");
        }
    }
}
