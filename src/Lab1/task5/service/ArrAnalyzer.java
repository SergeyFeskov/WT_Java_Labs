package Lab1.task5.service;

import java.util.Arrays;

public class ArrAnalyzer {        
    public static int getElementsCount(int[] array) {
        int[] sortArray = sort(array);
        int j = 0;
        int i = 0;
        int maxCount = 0;
        while (i < array.length && j < array.length) {
            while (i < array.length && array[i] < sortArray[j])
                i++;
            while (j < array.length && i < array.length && array[i] > sortArray[j])
                j++;
            if (j < array.length && i < array.length && array[i] == sortArray[j]) {
                maxCount++;
                j++;
                i++;
            }
        }
        return array.length - maxCount;
    }

    private static int[] sort(int[] array) {
        int[] sortArray = array.clone();
        Arrays.sort(sortArray);
        return sortArray;
    }
}
