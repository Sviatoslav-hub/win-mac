import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[] array_2 = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array_2[i] = random.nextInt(100);
        }
        Arrays.sort(array_2);
        for (int i = 0; i < array_2.length; i++) {
            System.out.print(" " + array_2[i]);

        }


    }
}


