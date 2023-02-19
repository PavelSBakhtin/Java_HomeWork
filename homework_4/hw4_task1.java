// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод (не void), который вернет “перевернутый” список.

package homework_4;

import java.util.LinkedList;

public class hw4_task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(ReverseList(list));
    }

    public static LinkedList<Integer> ReverseList(LinkedList<Integer> list) {
        LinkedList<Integer> revlist = new LinkedList<>();
        revlist.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, revlist.get(list.size() - 1 - i));
        }
        return list;
    }
}
