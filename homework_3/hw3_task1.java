// Пусть дан произвольный список целых чисел, удалить из него четные числа.

package homework_3;

import java.util.Random;
import java.util.ArrayList;

public class hw3_task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
