package chap10;

import java.util.StringTokenizer;

public class UnChecked1Demo {
    public static void main(String[] args) {
        String s = "Java C Python";
        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()+" +");
        }
        System.out.println(st.nextToken());
    }
}


class CheckedDemo extends Thread {
    public static void main(String[] args) {
        System.out.println("ttt");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ttt");
    }
}