import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = readElements(readInteger());
        System.out.println(Arrays.toString(array));
        System.out.println(findMin(array));
        input.close();
    }

    private static int readInteger() {
        Scanner console = new Scanner(System.in);
        System.out.println("How long array should be?");
        return console.nextInt();
    }

    private static int[] readElements(int length) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element №" + (i + 1));
            array[i] = console.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
