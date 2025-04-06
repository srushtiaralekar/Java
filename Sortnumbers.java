import java.util.Arrays;

public class Sortnumbers {
    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62, 31, 2, 13, 12};
        Arrays.sort(numbers);
        System.out.println("Sorted numbers in ascending order: " + Arrays.toString(numbers));
    }
}
