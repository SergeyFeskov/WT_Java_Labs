package Lab1.task8;

import java.util.ArrayList;
import java.util.Arrays;

import Lab1.task8.service.ArrConcatService;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(30, 48, 51, 57));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(28, 50, 64));
              
        ArrConcatService.printInsertedIndexes(a, b);
    }
}
