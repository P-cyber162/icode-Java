import java.util.Scanner; // Taking user input
import java.util.Random;

public class guessingGame {
    public static void main(String[]args) {
        int[] arr = new int[10];
        int value = 2;

        for (int i=0; i< arr.length; i++) {
            arr[i]= value;
            value +=2;
        }
        int sum = 0;
        for(int i=0; i< arr.length; i++) {
            sum += arr[i];
        };

        int average = sum/arr.length;

        int factorial = 1;
        for(int i=0; i<= average; i++) {
            factorial *= i;
        };
    }
}