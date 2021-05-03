package oop1;

import java.util.Scanner;

public class oop2 {
    public static void main(String[] args) {
        System.out.printf("2자리수 정수 입력(10~99)>>");
        Scanner scanner = new Scanner(System.in);

        int num, a, b;
        num = scanner.nextInt();

        a = num/10;
        b = num%10;

        if (a == b)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
    }
}
