import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,3,6,1,8};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sort(int[] arr) {
        boolean swapped;
        for (int i=0; i<arr.length; i++) {
            swapped = false;
            for (int j=1; j<arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
