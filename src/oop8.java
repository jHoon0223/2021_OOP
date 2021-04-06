import java.util.Scanner;

public class oop8 {
    public static boolean inRect(int x1, int y1, int x2, int y2) {
        if ((x1>=100 && x1<=200) && (y1>=100 && y1 <= 200)) return true;
        else if ((x1>=100 && x1<=200) && (y2>=100 && y2 <= 200)) return true;
        else if ((x2>=100 && x2<=200) && (y1>=100 && y1 <= 200)) return true;
        else if ((x2>=100 && x2<=200) && (y2>=100 && y2 <= 200)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("점 (x1,y1)의 좌표를 입력하시오>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.printf("점 (x2,y2)의 좌표를 입력하시오>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (inRect(x1, x2, y1, y2))
            System.out.println("점("+x1+","+y1+")와 점("+x2+","+y2+")는 사각형 안에 있습니다.");
        else
            System.out.println("점("+x1+","+y1+")와 점("+x2+","+y2+")는 사각형 안에 있지 않습니다.");
    }
}
