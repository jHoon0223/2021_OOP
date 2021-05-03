package oop1;

import java.util.Scanner;

public class oop12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("연산>>");

        double a = scanner.nextDouble();
        String s = scanner.next();
        double b = scanner.nextDouble();
        double sum = 0;

        switch (s) {
            case "+":
                sum = a+b;
                break;
            case "-":
                sum = a-b;
                break;
            case "*":
                sum = a*b;
                break;
            case "/":
                sum = a/b;
                break;
        }

        System.out.printf((int)a+s+(int)b+"의 계산 결과는 "+(int)sum);
    }
}