package oop3;

import java.util.Scanner;

public class grade {
    private int math;
    private int science;
    private int english;

    grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    int average() {
        return (math + science + english) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        oop3.grade me = new oop3.grade(math, science, english);
        System.out.println("평균은 " + me.average());

        scanner.close();
    }
}