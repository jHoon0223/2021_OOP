public class oop_2_10 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int arr_i;
        int arr_j;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int)(Math.random()*10 + 1);
            }
        }

        for (int i = 0; i < 6; i++) {
            arr_i = (int)(Math.random()*4);
            arr_j = (int)(Math.random()*4);

            array[arr_i][arr_j] = 0;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
