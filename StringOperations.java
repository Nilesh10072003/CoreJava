package assingment;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concatenated = str1 + " " + str2;

        // Index of a character
        int indexOfChar = str1.indexOf('e');

        // Character at a specific index
        char charAtIndex = str1.charAt(1);

        // Compare two strings
        boolean areEqual = str1.equals(str2);

        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Index of 'e' in 'Hello': " + indexOfChar);
        System.out.println("Character at index 1 in 'Hello': " + charAtIndex);
        System.out.println("Are the strings equal? " + areEqual);
    }
}

