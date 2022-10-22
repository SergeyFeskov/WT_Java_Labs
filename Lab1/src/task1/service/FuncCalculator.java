package task1.service;

import task1.model.Data;

public class FuncCalculator {
    public static double calculate(Data data) {
        double x = data.getX();
        double y = data.getY();
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }
}
