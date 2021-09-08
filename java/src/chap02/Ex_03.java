package chap02;

public class Ex_03 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i!=11;i++) {
            sum = sum + i;
            System.out.print(i);
            if(i==10)break;
            System.out.print("+");
        }
        System.out.println("=" + sum);
    }
}
