// Задано уравнение вида x + y = z. И (x, y, z) >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

package homework_1;

import java.util.Scanner;

public class hw1_task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the equation: ");
        String input = scan.nextLine();
        String[] str = input.split(" ");
        for (int i = 0; i < input.length(); i++) {
            if (str[i] == "?") {
                
            }
        }
        scan.close();
    }
}

// Задачу обязательно решу, пока не додумался как...