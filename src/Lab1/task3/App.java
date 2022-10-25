package Lab1.task3;

import Lab1.task3.model.Params;
import Lab1.task3.model.Table;
import Lab1.task3.service.FuncCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        Params params = new Params();
        Table result = FuncCalculator.calculate(params);
        result.printTable();
    }
}
