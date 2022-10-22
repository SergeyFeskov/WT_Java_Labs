package task1;

import task1.model.Data;
import task1.service.FuncCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        Data data = new Data();
        double result = FuncCalculator.calculate(data);
        System.out.print("Function result: ");
        System.out.println(result);
    }
}
