package SmallestAndLargest;

public class SmallestAndLargest {
    public static void main(String[] args) {
        smallestAndLargest(new int[]{-20, 34, 21, -87, 92, Integer.MAX_VALUE});
    }

    private static void smallestAndLargest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int value : array) {
            if (value < smallest) {
                smallest = value;
            }
            if (value > largest) {
                largest = value;
            }
        }
        System.out.println("Smallest numbers is " + smallest + " and largest is " + largest);
    }
}
