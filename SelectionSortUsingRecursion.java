import java.util.Arrays;

public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 6, 78, 56, 34, 5};
        SelectionSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {5, 3, 2, 1, 6, 78, 56, 34, 5};
        SelectionSort2(arr2, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr2));
    }
    //First Way
    static void SelectionSort(int[] arr, int r) {
        if (r == 0) {
            return;
        }
        int max = 0;
        max = getMax(arr, r, 1, max);
        int temp = arr[max];
        arr[max] = arr[r];
        arr[r] = temp;
        SelectionSort(arr, r - 1);

    }

    static int getMax(int[] arr, int r, int c, int max) {
        if (arr[c] > arr[max]) {
            max = c;
        }
        if (c == r)
            return max;
        return getMax(arr, r, c + 1, max);
    }
    //Second Way
    static void SelectionSort2(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c <= r) {
            if (arr[c] > arr[max]) {
                SelectionSort2(arr, r, c+1, c);
            }
            else {
                SelectionSort2(arr, r, c+1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            SelectionSort2(arr, r-1, 0, 0);
        }
    }
}

