package test;

public class NumOfCount {
    public static void main(String[] args) {
        int a[] = new int[10];
        a[0] = 1;
        a[1] = 9;
        a[2] = 3;
        a[3] = 2;
        a[4] = 4;
        a[5] = 3;
        a[6] = 2;
        a[7] = 9;
        a[8] = 1;
        a[9] = 5;
        for (int i = 0; i != 10; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j != 10; j++) {
                if (a[j] == i)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}