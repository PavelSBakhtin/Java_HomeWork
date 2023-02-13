// Вывести все простые числа от 1 до 1000.

package homework_1;

import java.util.Scanner;

public class hw1_task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        Integer n = scan.nextInt();
        boolean f = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    f = false;
                    break;
                }
            }
            if (f) System.out.println(i);
            else f = true;
        }
        scan.close();
    }
}
