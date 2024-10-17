package arrayDemo;

public class LargestNumber {

	public static void main(String[] args) {
int[] numbers = {23, 45, 12, 78, 56, 89, 34, 67, 90, 21};
        
        // Initialize the largest number to the first element of the array
        int largest = numbers[0];
        
        // Loop through the array to find the largest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        // Display the largest number
        System.out.println("The largest element in the array is: " + largest);

	}

}
