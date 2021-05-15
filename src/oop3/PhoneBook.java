package oop3;

import java.util.Scanner;

public class PhoneBook {
    private String name;
    private String tel;

    PhoneBook(int a) { }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수>>");
        int n = scanner.nextInt();
        String name;

        PhoneBook[] Phone = new PhoneBook[n];
        for (int i = 0; i < n; i++) {
            Phone[i] = new PhoneBook(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력>>");
            Phone[i].name = scanner.next();
            Phone[i].tel = scanner.next();
        }
        System.out.println("저장되었습니다...");

        while(true) {
            int cnt = 0;
            System.out.print("검색할 이름>>");
            name = scanner.next();

            if (name.equals("그만"))
                break;

            for (int i = 0; i < n; i++) {

                if (name.equals(Phone[i].name)) {
                    System.out.println(name + "의 번호는 " + Phone[i].tel + " 입니다.");
                    break;
                }
                else {
                    cnt++;
                    if (cnt == n) {
                        System.out.println(name + "이 없습니다.");
                        break;
                    }
                }
            }
        }
    }
}
