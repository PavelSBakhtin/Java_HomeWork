// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску. 0x00000 0000x00 00x0000

package homework_5;

public class hw5_task3 {
    public static void main(String[] args) {
        Integer[][] field = new Integer[8][8];
        field = generateArray(8, 8);
        arrangement(field, 0);
    }

    private static boolean check(Integer[][] array, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (array[i][c] == 1) {
                return false;
            }
        }

        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (array[i][j] == 1) {
                return false;
            }
        }

        for (int i = r, j = c; i >= 0 && j < 8; i--, j++) {
            if (array[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private static void arrangement(Integer[][] array, int r) {
        if (r == 8) {
            printArray(array);
            return;
        }

        for (int i = 0; i < 8; i++) {
            if (check(array, r, i)) {
                array[r][i] = 1;
                arrangement(array, r + 1);
                array[r][i] = 0;
            }
        }
    }

    public static Integer[][] generateArray(Integer row, Integer collumn) {
        Integer[][] array = new Integer[row][collumn];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }

    public static void printArray(Integer[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.printf("%d", array[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
