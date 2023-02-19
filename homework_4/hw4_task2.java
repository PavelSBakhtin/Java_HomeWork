// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package homework_4;

import java.util.LinkedList;
import java.util.Scanner;

public class hw4_task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        String element = "";
        LinkedList<String> list = new LinkedList<>();
        while (!str.equals("0")) {
            System.out.println("Choose command:");
            System.out.println("1) put an element at the end of the queue:");
            System.out.println("2) return the first element from the queue and remove it:");
            System.out.println("3) return the first element from the queue without removing it:");
            System.out.println("0) end of work (quit)");
            str = scan.nextLine();
            switch (str) {
                case ("1"):
                    System.out.println("Enter list item:");
                    str = scan.nextLine();
                    list = enqueue(list, str);
                    break;
                case ("2"):
                    if (list.isEmpty()) {
                        System.out.println("The list is already empty \n");
                    } else {
                        element = list.get(0);
                        list = dequeue(list);
                        System.out.printf("First element of the list: %s \n", element);
                        break;
                    }
                case ("3"):
                    element = first(list);
                    System.out.printf("First element of the list: %s \n", element);
                    break;
            }
            System.out.println("List");
            System.out.println(list);
        }
        scan.close();
    }

    public static LinkedList<String> enqueue(LinkedList<String> list, String str) {
        list.add(str);
        return list;
    }

    public static LinkedList<String> dequeue(LinkedList<String> list) {
        list.remove(0);
        return list;
    }

    public static String first(LinkedList<String> list) {
        String firstElem = (String) list.get(0);
        return firstElem;
    }
}
