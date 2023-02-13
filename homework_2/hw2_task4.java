// К калькулятору из предыдущего дз добавить логирование

package homework_2;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class hw2_task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number A: ");
        Integer a = scan.nextInt();
        System.out.print("Enter an operator: ");
        char s = scan.next().charAt(0);
        System.out.print("Enter the number B: ");
        Integer b = scan.nextInt();
        int res = Calc(a, s, b);
        System.out.printf("The result is: " + a + s + b + "=" + res + "\n");
        scan.close();
        toLog(res);
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

    public static void toLog(Integer res) {
        Logger log = Logger.getLogger("Calc");
        FileHandler fh;
        try {
            fh = new FileHandler("homework_2/hw2_task4_log");
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("\nExpression result: " + res);
    }
}
