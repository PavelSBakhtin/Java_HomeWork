// Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение)

package homework_2;

import java.util.Scanner;

public class hw2_task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String input = scan.nextLine();
        scan.close();
        boolean res = isPal(input);
        System.out.println(res);
    }
    public static Boolean isPal(String s) {
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
