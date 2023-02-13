// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package homework_2;

import java.io.FileWriter;
import java.util.Arrays;

public class hw2_task1 {
    public static void main(String[] args) throws Exception {
        int[] nums = { 23, 17, 19, 6, 2 };
        boolean sort = false;
        int temp;
        FileWriter fwr = new FileWriter("homework_2/hw2_task1_log.txt", true);
            for (int f = 0; f < nums.length; f++) {
                fwr.write(nums[f] + " ");
                if (f == nums.length - 1) {
                    fwr.write("\n");
                }
            }
        while (!sort) {
            sort = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    sort = false;
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
                for (int j = 0; j < nums.length; j++) {
                    fwr.write(nums[j] + " ");
                    if (j == nums.length - 1) {
                        fwr.write("\n");
                    }
                }
            }
        }
        fwr.close();
        System.out.println(Arrays.toString(nums));
    }
}

// Не знаю - почему в лог записывает так много отсортированного в конце.
// Сколько не пытался от этого избавиться - не получилось.