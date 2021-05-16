package oop3;

import java.util.Scanner;

public class consertReservation {
    private String[] seat = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };

    consertReservation(int a) { }

    void addResv(String name, int num) {
        if (num > seat.length || num < 0)
            System.out.println("<<<좌석에 없는 번호입니다.>>>");
        else if (seat[num-1].equals("---")){
            seat[num-1] = name;
            System.out.println("<<<예약을 완료하였습니다.>>>");
        }
        else
            System.out.println("<<<이미 예약이 완료된 좌석입니다.>>>");
    }
    void printResv() {
        for (int i = 0; i < seat.length; i++) {
            System.out.print(seat[i] + " ");
        }
        System.out.println(" ");
    }
    void removeResv(String name) {
        int cnt = 0;
        for (int i = 0; i < seat.length; i++) {
            if (name.equals(seat[i])) {
                seat[i] = "---";
                System.out.println("<<<예약이 취소되었습니다.>>>");
            }

            else
                cnt++;
        }
        if (cnt == seat.length)
            System.out.println("<<<" + name + "님은 예약 목록에 없습니다.>>>");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        consertReservation[] R = new consertReservation[3];
        R[0] = new consertReservation(1);   //S
        R[1] = new consertReservation(2);   //A
        R[2] = new consertReservation(3);   //B

        int option, n, number;
        String name;

        System.out.println("<<<명품콘서트홀 예약 시스템입니다.>>>");

        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            option = scanner.nextInt();

            if (option == 4)
                break;

            switch(option) {
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    n = scanner.nextInt()-1;
                    if (n == 0)
                        System.out.print("S>> ");
                    else if (n == 1)
                        System.out.print("A>> ");
                    else if (n == 2)
                        System.out.print("B>> ");
                    else {
                        System.out.println("<<<존재하지 않는 좌석구분 입니다.>>>");
                        break;
                    }
                    R[n].printResv();
                    System.out.print("이름>>");
                    name = scanner.next();
                    System.out.print("번호>>");
                    number = scanner.nextInt();
                    R[n].addResv(name, number);
                    break;
                case 2:
                    System.out.print("S>> ");
                    R[0].printResv();
                    System.out.print("A>> ");
                    R[1].printResv();
                    System.out.print("B>> ");
                    R[2].printResv();
                    System.out.println("<<<조회를 완료하였습니다.>>>");
                    break;
                case 3:
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    n = scanner.nextInt()-1;
                    if (n == 0)
                        System.out.print("S>> ");
                    else if (n == 1)
                        System.out.print("A>> ");
                    else if (n == 2)
                        System.out.print("B>> ");
                    else {
                        System.out.println("<<<존재하지 않는 좌석구분 입니다.>>>");
                        break;
                    }
                    R[n].printResv();
                    System.out.print("이름>>");
                    name = scanner.next();
                    R[n].removeResv(name);
                    break;
                default:
                    System.out.println("<<<존재하지 않는 옵션입니다.>>>");
                    break;
            }
        }
    }
}