import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {
        //selectionSort();
        int[] arr = {7,1,4,6,3,9,2};
        //System.out.println(linearSearch(arr, 3));
        System.out.println(Arrays.toString(bubbleSort(arr)));
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

    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int[] bubbleSort(int[] arr) {
        int last = arr.length - 2;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j <= last; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            last--;
        }
        return arr;
    }


}
