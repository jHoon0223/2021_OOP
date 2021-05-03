package oop2;

import java.util.Scanner;

public class oop_2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = { "가위", "바위", "보" };

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while (true) {
            System.out.printf("가위 바위 보!>>");
            String user = scanner.next();

            if (user.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }

            int n = (int)(Math.random()*3);

            if (str[n].equals("가위")) {
                if (user.equals("가위"))
                    System.out.printf("사용자 : 가위, 컴퓨터 : %s, 비겼습니다.\n", str[n]);
                else if (user.equals("바위"))
                    System.out.printf("사용자 : 바위, 컴퓨터 : %s, 사용자가 이겼습니다.\n", str[n]);
                else if (user.equals("보"))
                    System.out.printf("사용자 : 보, 컴퓨터 : %s, 컴퓨터가 이겼습니다.\n", str[n]);
            }
            if (str[n].equals("바위")) {
                if (user.equals("가위"))
                    System.out.printf("사용자 : 가위, 컴퓨터 : %s, 컴퓨터가 이겼습니다.\n", str[n]);
                else if (user.equals("바위"))
                    System.out.printf("사용자 : 바위, 컴퓨터 : %s, 비겼습니다.\n", str[n]);
                else if (user.equals("보"))
                    System.out.printf("사용자 : 보, 컴퓨터 : %s, 사용자가 이겼습니다.\n", str[n]);
            }
            if (str[n].equals("보")) {
                if (user.equals("가위"))
                    System.out.printf("사용자 : 가위, 컴퓨터 : %s, 사용자가 이겼습니다.\n", str[n]);
                else if (user.equals("바위"))
                    System.out.printf("사용자 : 바위, 컴퓨터 : %s, 컴퓨터가 이겼습니다.\n", str[n]);
                else if (user.equals("보"))
                    System.out.printf("사용자 : 보, 컴퓨터 : %s, 비겼습니다.\n", str[n]);
            }
        }
    }
}
