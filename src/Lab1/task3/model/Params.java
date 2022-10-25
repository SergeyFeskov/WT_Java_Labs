package Lab1.task3.model;

import java.util.Scanner;

public class Params {
    private double a;
    private double b;
    private double h;

    public Params(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Params() {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter a: ");
        this.a = scanner.nextDouble();
        System.out.print("Enter b: ");
        this.b = scanner.nextDouble();
        System.out.print("Enter h: ");
        this.h = scanner.nextDouble();
        scanner.close();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
