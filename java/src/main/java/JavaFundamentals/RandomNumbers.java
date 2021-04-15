package JavaFundamentals;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random amountOfNumbers = new Random();
        int [] arrayOfNumbers = new int[10];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = amountOfNumbers.nextInt(100);
            System.out.println(arrayOfNumbers[i]);
        }
        for (int j : arrayOfNumbers) {
            System.out.print(j + " ");
        }
    }
}
