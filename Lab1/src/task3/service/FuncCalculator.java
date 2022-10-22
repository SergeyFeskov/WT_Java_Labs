package task3.service;

import task3.model.Params;
import task3.model.Table;

public class FuncCalculator {
    public static Table calculate(Params params) {
        double x = params.getA();
        double end = params.getB();
        double step = params.getH();

        int rowsNum = (int)((end - x) / step);
        Table table = new Table(rowsNum);

        for (int i = 0; i < rowsNum; i++) {
            table.vals[i][0] = x;
            table.vals[i][1] = Math.tan(x);
            x += step;
        }

        return table;
    }
}
