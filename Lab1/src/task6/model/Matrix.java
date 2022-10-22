package task6.model;

public class Matrix {
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }
    
    public void print() {
        int lineLen = matrix.length * 10 + 1;
        
        printLine(lineLen);
        for (double[] row : matrix) {
            System.out.print('|');        
            for (double num : row) {
                System.out.printf(" %7.2f |", num);                
            }    
            System.out.print('\n');        
        }
        printLine(lineLen);
    }

    private void printLine(int lineLen) {
        String line = "";
        for (int i = 0; i < lineLen; i++) {
            line += "-";
        }
        System.out.println(line);
    }
}
