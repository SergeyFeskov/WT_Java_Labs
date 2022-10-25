package Lab1.task1.model;

import java.util.Scanner;

public class Data {
    private double x;
    private double y;

    public Data(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Data() {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter x: ");
        this.x = scanner.nextDouble();
        System.out.print("Enter y: ");
        this.y = scanner.nextDouble();
        scanner.close();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
