import java.util.Scanner;

public class oop10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("첫번째 원의 중심과 반지름 입력>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();

        System.out.printf("두번째 원의 중심과 반지름 입력>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        int D = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        int d = (int) Math.sqrt(D);

        if (d < r1+r2) System.out.println("두 원은 서로 겹친다.");
    }
}
