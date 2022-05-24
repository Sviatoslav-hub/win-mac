import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }

        }


    }

    public static void main(String[] args) {
        int[] array = new int[19];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);

        }
        System.out.println(Arrays.toString(array));

        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("" + array[i]);

        }
    }


}
