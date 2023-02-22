// Реализовать алгоритм сортировки слиянием.

package homework_3;

import java.util.*;

public class hw3_task3 {
    public static void main(String[] args) {
        int[] array = {92, 26, 34, 81, 65, 40};
        int[] result = merge(array);
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] merge(int[] array) {
        int[] buf1 = Arrays.copyOf(array, array.length);
        int[] buf2 = new int[array.length];
        int[] result = sort(buf1, buf2, 0, array.length);
        return result;
    }

    public static int[] sort(int[] buf1, int[] buf2, int indexF, int indexL) {
        if (indexF >= indexL - 1) {
            return buf1;
        }

        int middle = indexF + (indexL - indexF) / 2;
        int[] sorted1 = sort(buf1, buf2, indexF, middle);
        int[] sorted2 = sort(buf1, buf2, middle, indexL);

        int index1 = indexF;
        int index2 = middle;
        int index3 = indexF;
        int[] result = sorted1 == buf1 ? buf2 : buf1;
        while (index1 < middle && index2 < indexL) {
            result[index3++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[index3++] = sorted1[index1++];
        }
        while (index2 < indexL) {
            result[index3++] = sorted2[index2++];
        }
        return result;
    }
}
