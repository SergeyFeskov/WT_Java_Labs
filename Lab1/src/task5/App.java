package task5;

import java.util.Scanner;

import task5.service.ArrAnalyzer;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = inputArray();
        int result = ArrAnalyzer.getElementsCount(arr);
        System.out.print("Num of elements, which should be deleted: ");
        System.out.println(result);
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
