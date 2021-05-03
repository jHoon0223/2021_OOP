package oop1;

import java.util.Scanner;

public class oop4 {
    public static void main(String[] args) {
        System.out.printf("정수 3개 입력>>");
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.printf("중간 값은 ");

        if (a<b) {
            if (c<a)
                System.out.printf("%d", a);
            else if (c==a)
                System.out.printf("%d", a);
            else if (a<c) {
                if (b<c)
                    System.out.printf("%d", b);
                else if (b>c)
                    System.out.printf("%d", c);
                else if (b == c)
                    System.out.printf("%d", c);
            }
        }
        else if (a>b) {
            if (b>c)
                System.out.printf("%d", b);
            else if (b==c)
                System.out.printf("%d", b);
            else if (b<c) {
                if (a<c)
                    System.out.printf("%d", a);
                else if (a==c)
                    System.out.printf("%d", a);
                else if (a>c)
                    System.out.printf("%d", c);
            }
        }
        else if (a==b)
            System.out.printf("%d", a);

    }
}
