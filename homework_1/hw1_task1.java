// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)
// Пример: T5 = 1+2+3+4+5, 5! = 1*2*3*4*5.

package homework_1;

import java.util.*;

public class hw1_task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        Integer n = scan.nextInt();
        Integer sum = 0;
        Integer mult = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        for (int j = 2; j <= n; j++) {
            mult *= j;
        }
        scan.close();
        System.out.println("T" + n + " = " + sum);
        System.out.println(n + "! = " + mult);
    }
}
