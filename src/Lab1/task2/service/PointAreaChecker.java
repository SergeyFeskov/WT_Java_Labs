package Lab1.task2.service;

import Lab1.task2.model.Point;

public class PointAreaChecker {
    private static boolean between(double value, double left, double right) {
        return (value >= left) && (value <= right);
    }

    private static boolean topHorLineChech(double x, double y) {        
        return (Math.abs(x) <= 4) ? (y <= 5) : true;
    }

    private static boolean topVertLinesChech(double x, double y) {        
        return (between(y, 0, 5)) ? (Math.abs(x) <= 4) : true;
    }

    private static boolean midHorLinesChech(double x, double y) {        
        return (between(x, -6, -4) || between(x, 4, 6)) ? (y <= 0) : true;
    }

    private static boolean bottomVertLinesChech(double x, double y) {        
        return (between(y, -3, 0)) ? (Math.abs(x) <= 6) : true;
    }

    private static boolean bottomHorLineChech(double x, double y) {        
        return (Math.abs(x) <= 6) ? (y >= -3) : true;
    }

    public static boolean IsInArea(Point point) {
        double x = point.getX();
        double y = point.getY();
        return topHorLineChech(x, y) 
            && topVertLinesChech(x, y) 
            && midHorLinesChech(x, y) 
            && bottomVertLinesChech(x, y) 
            && bottomHorLineChech(x, y);
    }
}
