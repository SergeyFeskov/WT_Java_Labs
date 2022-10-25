package Lab1.task4.service;

public class ArrAnalyzer {
    public static void printIndexesOfPrimeNumbers(int[] arr) {        
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i]))
                System.out.println(i);
        }
    } 
    
    private static boolean isPrime(int num) {
        if(num <= 0)
            return false;

        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
