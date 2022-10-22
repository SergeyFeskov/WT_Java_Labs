package task3.model;

public class Table {
    public double[][] vals;
    
    public Table(int rowsNum) {
        this.vals = new double[rowsNum][2];
    }

    private void drawLine() {
        System.out.println("------------------");
    }

    public void printTable() {        
        drawLine();
        System.out.println("|   x   |  F(x)  |");
        drawLine();
        for (double[] row : vals) {
            System.out.printf("| %3.2f | %7.4f |\n", row[0], row[1] );
        }
        drawLine();
    }
}
