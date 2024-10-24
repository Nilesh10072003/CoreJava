package assingment;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] array = {3, 1, 4, 1, 5, 9, 2, 6};
        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Sorted in Descending Order: " + Arrays.toString(array));
    }
}

