import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[10];
        fillArrayRandom(array1);
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1, Collections.reverseOrder());
        System.out.println(Arrays.toString(array1));
    }

    public static void fillArrayRandom(Integer[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
