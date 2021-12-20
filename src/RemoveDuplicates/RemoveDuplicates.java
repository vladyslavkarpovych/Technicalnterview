package RemoveDuplicates;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 1, 3, 2, 1, 4};
        System.out.println("Unsorted array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(removeDuplicates(array)));
    }

    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);
        int[] result = new int[array.length];
        int previous = array[0];
        result[0] = previous;

        for (int i = 1; i < array.length; i++) {
            int ch = array[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;
    }
}
