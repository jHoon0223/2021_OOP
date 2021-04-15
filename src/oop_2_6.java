import java.util.Scanner;

public class oop_2_6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner scanner = new Scanner(System.in);

        System.out.printf("금액을 입력하시오>>");
        int price = scanner.nextInt();
        int a;

        for (int i = 0; i < unit.length; i++) {
            a = price/unit[i];

            if (a!=0) {
                System.out.println(unit[i]+"원 짜리 : "+a+"개");
                price = price - a*unit[i];
            }
        }
    }
}
