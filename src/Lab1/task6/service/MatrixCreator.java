package Lab1.task6.service;

import Lab1.task6.model.Matrix;

public class MatrixCreator {
    public static Matrix createMatrix(double[] arr) {
        int arrLen = arr.length;
        double[][] matrix = new double[arrLen][arrLen];
        
        int shift = 0;
        for (int i = 0; i < arrLen; i++) {
            int curr_ind = shift;
            for (int j = 0; j < arrLen; j++) {
                matrix[i][j] = arr[curr_ind];
                curr_ind = (curr_ind == arrLen - 1) ? 0 : (curr_ind + 1);
            }
            shift++;
        }

        return new Matrix(matrix);
    }
}
