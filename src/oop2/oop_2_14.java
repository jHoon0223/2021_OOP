package oop2;

import java.util.Scanner;

public class oop_2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
        int score[] = { 95, 88, 76, 62, 55 };

        while (true) {
            System.out.printf("과목 이름>>");
            String name = scanner.next();

            if (course[0].equals(name)) {
                int n = score[0];
                System.out.printf("%s의 점수는 %d\n", course[0], n);
            }
            else if (course[1].equals(name)) {
                int n = score[1];
                System.out.printf("%s의 점수는 %d\n", course[1], n);
            }
            else if (course[2].equals(name)) {
                int n = score[2];
                System.out.printf("%s의 점수는 %d\n", course[2], n);
            }
            else if (course[3].equals(name)) {
                int n = score[3];
                System.out.printf("%s의 점수는 %d\n", course[3], n);
            }
            else if (course[4].equals(name)) {
                int n = score[4];
                System.out.printf("%s의 점수는 %d\n", course[4], n);
            }
            else if (name.equals("그만")) {
                break;
            }
            else {
                System.out.println("없는 과목입니다.");
            }
        }
    }
}
