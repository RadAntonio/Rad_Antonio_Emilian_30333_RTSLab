package LabSession1.ex3;
import java.util.Random;

public class SortingRandomNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10]; //vector of integers 10 in total

        // Generate random numbers and store them in the array using java.util.Random librabry
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt(42); // Creating random numbers between 0 and 42
        }
        // Printing the array not sorted
        System.out.println("Not sorted numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        // Sort the array
        for (int i = 0; i < randomNumbers.length - 1; i++) {
            for (int j = 0; j < randomNumbers.length - 1 - i; j++) {
                //Sorting the array using an auxiliar variablr
                if (randomNumbers[j] > randomNumbers[j + 1]) {
                    int temp = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = temp;
                }
            }
        }

        // Display the sorted numbers in console
        System.out.println("Sorted numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
    }
}
