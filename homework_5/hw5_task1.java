// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package homework_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class hw5_task1 {
    public static void main(String[] args) {

        Map<String, List<Integer>> db = new HashMap<>();

        db.put("Иванов", List.of(209822, 171819));
        db.put("Петров", List.of(383454));
        db.put("Сидоров", List.of(489123, 599654, 677258));
        db.put("Афонин", List.of(753951));

        printDB(db);
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.println("Enter surname: ");
        String name = scan.next();

        printSub(db, name);
        scan.close();

    }

    public static void printDB(Map<String, List<Integer>> db) {

        for (String human : db.keySet()) {
            System.out.printf("Surname: %s ", human);
            Integer count = 0;
            for (Integer phone : db.get(human)) {
                count++;
                System.out.printf("phone %d: %d,", count, phone);
            }
            System.out.println("");
        }
    }

    public static void printSub(Map<String, List<Integer>> db, String human) {

        if (db.containsKey(human)) {
            Integer count = 0;
            for (Integer phone : db.get(human)) {
                count++;
                System.out.printf(" phone %d: %d,", count, phone);
            }
            System.out.println("");
        } else {
            System.out.println("Such human is not found \n");
        }

    }
}
