package PrimeFactors;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.printf("Prime factors of integer '%d' are : %s %n", 72, primeFactors(72));
        System.out.printf("Prime factors of positive number '%d' is : %s %n", 189, primeFactors(189));
        System.out.printf("Prime factors of number '%d' are as follows : %s %n", 232321, primeFactors(232321));
        System.out.printf("Prime factors of number '%d' are as follows : %s %n", 67232321, primeFactors(67232321));

    }

    public static Set<Integer> primeFactors(int number) {
        Set<Integer> setOfPrimeFactors = new LinkedHashSet<>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                setOfPrimeFactors.add(i);
                number /= i;
                i--;
            }
        }
        return setOfPrimeFactors;
    }
}

