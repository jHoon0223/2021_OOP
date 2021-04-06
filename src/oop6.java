import java.util.Scanner;

public class oop6 {
    public static void main(String[] args) {
        System.out.printf("1~99 사이의 정수를 입력하시오>>");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (30<=num && num<40) {
            if (num%10==3)
                System.out.printf("박수짝짝");
            else if (num%10==6)
                System.out.printf("박수짝짝");
            else if (num%10==9)
                System.out.printf("박수짝짝");
            else
                System.out.printf("박수짝");
        }
        else if (60<=num && num<70) {
            if (num%10==3)
                System.out.printf("박수짝짝");
            else if (num%10==6)
                System.out.printf("박수짝짝");
            else if (num%10==9)
                System.out.printf("박수짝짝");
            else
                System.out.printf("박수짝");
        }
        else if (90<=num && num<100) {
            if (num%10==3)
                System.out.printf("박수짝짝");
            else if (num%10==6)
                System.out.printf("박수짝짝");
            else if (num%10==9)
                System.out.printf("박수짝짝");
            else
                System.out.printf("박수짝");
        }
        else if (num%10==3)
            System.out.printf("박수짝");
        else if (num%10==6)
            System.out.printf("박수짝");
        else if (num%10==9)
            System.out.printf("박수짝");
    }
}
