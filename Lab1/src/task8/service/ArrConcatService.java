package task8.service;

import java.util.ArrayList;

public class ArrConcatService {
    public static void printInsertedIndexes(ArrayList<Integer> a, ArrayList<Integer> b) {
        System.out.print("Indexes: ");
        int indexOfLastElements = checkFirstElements(a, b);
        checkLastElements(indexOfLastElements, a, b);
        System.out.println();
        System.out.println("Result list: " + a);
    }

    private static void checkLastElements(int i, ArrayList<Integer> a, ArrayList<Integer> b) {
        if(i != b.size()) {
            for (int j = i; j < b.size(); j++) {
                a.add(b.get(j));
                System.out.print(a.size() - 1 + " ");
            }
        }
    }

    private static int checkFirstElements(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        for (int j = 0; j < a.size(); j++) {
            if(i < b.size() && b.get(i) <= a.get(j)) {
                System.out.print(j + " ");
                int lastElement = a.get(a.size()-1);
                a.add(lastElement);
                for (int k = a.size()-2; k > j; k--) {
                    a.set(k, a.get(k-1));
                }
                a.set(j, b.get(i));
                i++;
            }
        }
        return i;
    }
}
