package PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
    private static int value;

    public static void main(String[] args) {
        readValue();
        for (int i = 2; i < value; i++) {
            if (isPrime(i)) {
                System.out.println("Prime numbers: " + i);
            }
        }
    }

    public static void readValue() {
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
