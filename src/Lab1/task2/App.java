package Lab1.task2;

import Lab1.task2.model.Point;
import Lab1.task2.service.PointAreaChecker;

public class App {
    public static void main(String[] args) throws Exception {
        Point point = new Point();
        boolean result = PointAreaChecker.IsInArea(point);
        System.out.print("Check result: ");
        System.out.println(result);
    }
}
