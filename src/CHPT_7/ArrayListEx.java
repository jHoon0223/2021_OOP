package CHPT_7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("이름 입력>>");
            String s = scanner.next();
            a.add(s);
        }

        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i) + " ");

        int longestIndex = 0;
        for (int i = 0; i < a.size(); i++)
            if (a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;

        System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
        scanner.close();
    }
}
