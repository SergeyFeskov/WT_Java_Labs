package Lab1.task1;

import Lab1.task1.model.Data;
import Lab1.task1.service.FuncCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        Data data = new Data();
        double result = FuncCalculator.calculate(data);
        System.out.print("Function result: ");
        System.out.println(result);
    }
}
