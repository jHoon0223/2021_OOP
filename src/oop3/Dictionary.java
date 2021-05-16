package oop3;

import java.util.Scanner;

class Dictionary {
    private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = { "love", "baby", "money", "future", "hope" };
    public static String kor2eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (word.equals(kor[i]))
                return word+"은(는) "+eng[i];
        }
        return word+"은(는) 저의 사전에 없습니다.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary d = new Dictionary();
        System.out.println("한영 단어 검색 프로그램입니다.");
        String input;

        while(true) {
            int cnt = 0;
            System.out.print("한글 단어>>");
            input = scanner.nextLine();

            if (input.equals("그만"))
                break;

            System.out.println(d.kor2eng(input));
        }
    }
}
