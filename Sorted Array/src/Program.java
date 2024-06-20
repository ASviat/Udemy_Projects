import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int[] array = getIntegers(5);
        printArray(array);
        array = sortIntegers(array);
        printArray(array);
    }

    public static int[] getIntegers(int arrayLength) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " numbers to your array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Print element " + (i + 1));
            array[i] = input.nextInt();
        }
        input.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d\n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        boolean flag = true;
        while (flag) {
            flag = false;
            int copy = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    flag = true;
                    copy = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = copy;
                }
            }
        }
        return array;
    }
}
