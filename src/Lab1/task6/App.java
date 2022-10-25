package Lab1.task6;

import java.util.Scanner;

import Lab1.task6.model.Matrix;
import Lab1.task6.service.MatrixCreator;

public class App {
    public static void main(String[] args) throws Exception {
        double[] arr = inputArray();
        Matrix result = MatrixCreator.createMatrix(arr);
        result.print();
    }

    private static double[] inputArray() {        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        return array;
    }
}
