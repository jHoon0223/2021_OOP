import java.util.Scanner;

public class Test {
    private String a;
    private String b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test[] t = new Test[2];

        int c = scanner.nextInt();

        for (int i = 0; i < c; i++) {
            t[i].a = scanner.next();
            t[i].b = scanner.next();
        }

        System.out.println(c + t[0].a + t[0].b + t[1].a + t[1].b);

    }
}
