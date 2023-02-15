// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

package homework_3;

import java.util.Random;
import java.util.ArrayList;

public class hw3_task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        int ave = 0;
        for (int i = 0; i < list.size(); i++) {
            ave = ave + list.get(i);
        }
        int res = ave / list.size();

        System.out.printf("Min: %d \n", min);
        System.out.printf("Max: %d \n", max);
        System.out.printf("Average: %d \n", res);
    }
}
