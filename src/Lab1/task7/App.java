package Lab1.task7;

import java.util.Arrays;
import java.util.Scanner;

import Lab1.task7.service.ArrSortService;

public class App {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(Arrays.toString(ArrSortService.shellSort(arr)));
    }

    private static int[] inputArray() {        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }
}
