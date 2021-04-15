import java.util.Scanner;

public class oop_2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("정수 몇개?");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = (int)(Math.random()*100 + 1);

        for(int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                while (array[i] == array[i-j]) {
                    array[i] = (int)(Math.random()*100 + 1);
                }
            }
        }

        for (int i = 0; i < n; i++)
            System.out.printf("%d ", array[i]);
    }
}
