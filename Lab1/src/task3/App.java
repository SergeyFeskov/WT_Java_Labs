package task3;

import task3.model.Params;
import task3.model.Table;
import task3.service.FuncCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        Params params = new Params();
        Table result = FuncCalculator.calculate(params);
        result.printTable();
    }
}
