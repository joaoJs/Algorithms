import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {
        //selectionSort();
        int[] arr = {9,5,7,3,6,2,1};
        selectionSort(arr);
        //System.out.println(linearSearch(arr, 3));
        //System.out.println(Arrays.toString(bubbleSort(arr)));
        bubbleSort2(arr);
    }


    public static void selectionSort(int[] arr) {
        //int[] arr = {1,3,5,4,2,6};

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


    static void bubbleSort2(int[] lst) {
        int n = lst.length;
        boolean swapped;
        do
        {
            swapped = false;
            for (int i = 0; i < n-1; i++) {
                //System.out.println(lst[i]);
                if (lst[i] > lst[i+1]) {
                    int temp = lst[i];
                    lst[i] = lst[i+1];
                    lst[i+1] = temp;
                    swapped = true;
                }
            }
        } while (swapped == true);

        System.out.println(Arrays.toString(lst));
    }


}
