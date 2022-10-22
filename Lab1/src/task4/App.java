package task4;

import task4.service.ArrAnalyzer;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {5, 12, 34, 21, 37, 15, 11, 3, 10};
        ArrAnalyzer.printIndexesOfPrimeNumbers(arr);
    }
}
