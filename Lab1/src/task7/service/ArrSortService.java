package task7.service;

public class ArrSortService {
    public static int[] shellSort(int[] arr) {
        int step = arr.length / 2;
        while (step > 0) {
            int i, j;
            for (i = step; i < arr.length; i++) {
                int value = arr[i];
                for (j = i - step; (j >= 0) && (arr[j] > value); j -= step)
                    arr[j + step] = arr[j];
                arr[j + step] = value;
            }
            step /= 2;
        }
        return arr;
    }
}
