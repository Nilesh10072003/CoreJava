
public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Initialize an array with a fixed size
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Attempt to access elements beyond the last index
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Accessing index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and print an error message
            System.out.println("Exception caught: Trying to access an index outside the array bounds!");
            e.printStackTrace();
        }
    }
}
