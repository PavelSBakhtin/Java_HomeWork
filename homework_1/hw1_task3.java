// Реализовать простой калькулятор.

package homework_1;

import java.util.Scanner;

public class hw1_task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number A: ");
        Integer a = scan.nextInt();
        System.out.print("Enter an operator: ");
        char s = scan.next().charAt(0);
        System.out.print("Enter the number B: ");
        Integer b = scan.nextInt();
        int res = Calc(a, s, b);
        System.out.printf("The result is: " + a + s + b + "=" + res);
        scan.close();
    }

    public static int Calc(int a, char s, int b) {
        int res = 0;
        if (s == '+') {
            res = a + b;
        }
        if (s == '-') {
            res = a - b;
        }
        if (s == '*') {
            res = a * b;
        }
        if (s == '/') {
            res = a / b;
        }
        return res;
    }
}
