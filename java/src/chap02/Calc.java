package chap02;

import java.util.Objects;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("연산자를 입력하세요");

        String opr = sc.next();

        double num1 = sc.nextDouble();

        double num2 = sc.nextDouble();

        if (Objects.equals(opr, "+")) System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

        if (Objects.equals(opr, "-")) System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

        if (Objects.equals(opr, "*")) System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

        if (Objects.equals(opr, "/")) System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

        if (Objects.equals(opr, "%")) System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
    }
}
