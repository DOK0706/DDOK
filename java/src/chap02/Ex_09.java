package chap02;

/*
public class Ex_09 {
    public static int sum() {
        int sum = 0;
        for (int i = 1; i != 11; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int b = sum();
        System.out.println(b);
    }
}
 */

public class Ex_09 {
    public static int sum(int n1, int n2) {
        int sum = 0;
        for (n1 = 10; n1<=n2;n1++){
            sum=sum+n1;
        }
        return sum;
    }
    public static double sum(double nd1, double nd2) {
        double sum = 0;
        for (double i=nd1; i<=nd2;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static double sum(double nd1, int n1) {
        double sum = 0;
        for (double i=nd1; i<=n1;i=i+0.5){
            sum=sum+i;
        }
        return sum;
    }


    public static void main(String[] args) {
        int n1 = 10, n2 = 100;
        double nd1=5.5, nd2=10.5;
        System.out.println(sum(n1, n2));
        System.out.println(sum(nd1, nd2));
        System.out.println(sum(nd1, n1));
    }
}