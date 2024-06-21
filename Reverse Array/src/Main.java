import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse(int[] array) {
        int copy = 0;
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            copy = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = copy;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}