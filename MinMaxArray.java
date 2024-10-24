package assingment;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum: " + min + ", Maximum: " + max);
    }
}
