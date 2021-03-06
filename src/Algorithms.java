import java.util.Arrays;


public class Algorithms {

    private static int countX = 0;

    public static void main(String[] args) {
        //selectionSort();
        int[] arr = {0,4,3,9,5,2,8,4};
        //selectionSort(arr);
        //System.out.println(linearSearch(arr, 3));
        //System.out.println(Arrays.toString(bubbleSort(arr)));
        //bubbleSort2(arr);
        //arr = mergeSort(arr);
        //binarySearch(arr, 4);
        //binarySearch2(4, arr, 0, arr.length);
        //selectionSort(arr);
        //linearSearch(arr, 9);
        //bubbleSort2(arr);
        mergeSort(arr);

    }


    public static void selectionSort(int[] arr) {
        //int[] arr = {1,3,5,4,2,6};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("HERE: ");
            System.out.println(i);
            System.out.println(Arrays.toString(arr));
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


    public static void bubbleSort2(int[] lst) {
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
        } while (swapped);

        System.out.println(Arrays.toString(lst));
    }


    public static int[] mergeSort(int[] lst) {
        int n = lst.length;
        int[] left;
        int[] right;

            // create space for left and right subarrays
            if (n % 2 == 0) {
                left = new int[n / 2];
                right = new int[n / 2];
            } else {
                left = new int[n / 2];
                right = new int[n / 2 + 1];
            }

            // fill up left and right subarrays
            for (int i = 0; i < n; i++) {
                if (i < n / 2) {
                    left[i] = lst[i];
                } else {
                    right[i - n / 2] = lst[i];
                }
            }

            if (n > 1) {
                // recursively split and merge
                right = mergeSort(right);
                left = mergeSort(left);
            }

                // merge
                System.out.println("Here: ");
                System.out.println(countX);
                System.out.println(Arrays.toString(merge(right, left)));
                return merge(right, left);


    }
    // the function for merging two sorted arrays
    public static int[] merge(int[] left, int[] right) {
        countX++;
        // create space for the merged array
        int[] result = new int[left.length+right.length];

        // running indices
        int i = 0;
        int j = 0;
        int index = 0;

        // add until one subarray is deplete
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[index] = left[i];
                index++;
                i++;
            } else {
                result[index] = right[j];
                index++;
                j++;
            }
                //System.out.println(Arrays.toString(result));
            }

                // add every leftover element from the subarray
                while (i < left.length) {
                    result[index] = left[i];
                    index++;
                    i++;
                }

                // only one of these two while loops will be executed
                while (j < right.length) {
                    result[index] = right[j];
                    index++;
                    j++;
                }
                //System.out.print("Result --> ");
                //System.out.println(Arrays.toString(result));
                return result;
            }

            // inefficient. Takes extra space in memory.
            public static String binarySearch(int[] arr, int num) {
                int n = arr.length;
                int median = n/2;
                int[] left;
                int[] right;

                if (arr.length == 1) {
                    if (arr[0] == num) {
                        System.out.println("Found");
                        return "Found";
                    } else {
                        System.out.println("Not found");
                        return "Not found";
                    }

                } else {

                    // if less then median, look for left half of array
                    if (num < arr[median]) {
                        //make space for left array
                        left = new int[n / 2];
                        // fill left array
                        for (int i = 0; i < median; i++) {
                            left[i] = arr[i];
                        }
                        System.out.println("Left <-- ");
                        System.out.println(Arrays.toString(left));
                        // Search for element in left half
                        return binarySearch(left, num);
                    } else if (num > arr[median]) {
                        // make space for right array
                        if (n % 2 == 0) {
                            right = new int[(n/2) - 1];
                        } else {
                            right = new int[n / 2];
                        }
                        // fill right array
                        for (int i = median + 1; i < n; i++) {
                            right[i - (median + 1)] = arr[i];
                        }
                        System.out.println("Right --> ");
                        System.out.println(Arrays.toString(right));
                        // search for element in right half
                        return binarySearch(right, num);
                    } else {
                        System.out.println("Found");
                        return "Found";
                    }
                }
            }

    // Efficient 
    public static boolean binarySearch2(int v, int[] lst, int low, int high) {
        if (low > high) {
            System.out.println("not found");
            return false;
        }

        int middle = (low+high)/2;

        if (v == lst[middle]) {
            System.out.println("found! It is at " + middle);
            return true;
        }
        else if (v > lst[middle]) {
            return binarySearch2(v, lst, middle+1, high);
        }
        else {
            return binarySearch2(v, lst, low, middle-1);
        }
    }


}
