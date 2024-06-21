import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 6, 12, 0, 50};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseOrder(array)));
    }

    private static int[] reverseOrder(int[] array) {
        int copy = 0;
        for (int i = 0; i < array.length / 2; i++) {
            copy = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = copy;
        }
        return array;
    }

}
