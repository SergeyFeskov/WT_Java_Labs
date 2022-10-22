package task2;

import task2.model.Point;
import task2.service.PointAreaChecker;

public class App {
    public static void main(String[] args) throws Exception {
        Point point = new Point();
        boolean result = PointAreaChecker.IsInArea(point);
        System.out.print("Check result: ");
        System.out.println(result);
    }
}
