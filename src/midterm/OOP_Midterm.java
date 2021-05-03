package midterm;

public class OOP_Midterm {
    public static void main(String[] args) {
        int[] a = new int[5];
        int b[] = a;

        a[1] = 2;
        b[1] = 6;

        System.out.println(a[1]);
        System.out.println(b[1]);

        int size = b.length;

        System.out.println(size);
    }
}
