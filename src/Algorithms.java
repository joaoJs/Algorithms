import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {
        selectionSort();

    }


    public static void selectionSort() {
        int[] arr = {1,3,5,4,2,6};

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            arr[indexMin] = arr[i];
            arr[i] = min;
        }
        System.out.println(Arrays.toString(arr));
    }


}
