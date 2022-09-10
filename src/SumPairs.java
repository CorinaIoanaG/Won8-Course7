import java.util.Arrays;

public class SumPairs {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {5, 8, 4, 1, 0, 3, 12, 7, 11};
        int sum = 15;
        Arrays.sort(arrayOfNumbers);
        if (arrayOfNumbers != null && sum != 0 && arrayOfNumbers.length >= 2) {
            System.out.println("Two numbers added who are equal with " + sum);
            give2PairsNumbers(arrayOfNumbers, sum);
            if (arrayOfNumbers.length > 2) {
                System.out.println("Three numbers added who are equal with " + sum);
                give3PairsNumbers(arrayOfNumbers, sum);
            }
        }

    }

    // Gives 2 pairs of number who are equals with sum if we add them
    private static void give2PairsNumbers(int[] arrayOfNumbers, int sum) {
        int sumCheck;
        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                sumCheck = arrayOfNumbers[i] + arrayOfNumbers[j];
                if (sumCheck == sum) {
                    System.out.println(arrayOfNumbers[i] + " " + arrayOfNumbers[j]);
                }
                if (sumCheck >= sum) {
                    j = arrayOfNumbers.length;
                }
            }
        }
    }

    // Gives 3 pairs of number who are equals with sum if we add them
    private static void give3PairsNumbers(int[] arrayOfNumbers, int sum) {
        int sumCheck;
        for (int i = 0; i < arrayOfNumbers.length - 2; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length - 1; j++) {
                sumCheck = arrayOfNumbers[i] + arrayOfNumbers[j];
                if (sumCheck >= sum) {
                    j = arrayOfNumbers.length;
                }
                for (int k = j + 1; k < arrayOfNumbers.length; k++) {
                    sumCheck = arrayOfNumbers[i] + arrayOfNumbers[j] + arrayOfNumbers[k];
                    if (sumCheck == sum) {
                        System.out.println(arrayOfNumbers[i] + " " + arrayOfNumbers[j] + " " + arrayOfNumbers[k]);
                    }
                    if (sumCheck >= sum) {
                        k = arrayOfNumbers.length;
                    }
                }
            }
        }
    }

}