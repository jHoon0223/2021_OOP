package oop2;

import java.util.Scanner;

public class oop_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("소문자 알파벳 하나를 입력하시오>>");
        String s = scanner.next();
        char c = s.charAt(0);

        for (int i = 0; i < c-96; i++) {
            for (int j = 97; j <= c-i; j++) {
                System.out.printf("%c ", j);
            }
            System.out.printf("\n");
        }
    }
}
