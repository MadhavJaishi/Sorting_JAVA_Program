import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//working
public class QuickSortUsingRecursion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter no of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter choice: ");
        int ch = in.nextInt();
        if (ch == 0) {
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
        } else if (ch == 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = n - i;
            }
        } else {
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(1000);
            }
        }
        arr[n] = 9999;
        long start, end, Time;

        System.out.println(Arrays.toString(arr));
        start = System.nanoTime();
        sort(arr, 0, arr.length - 1);
        end = System.nanoTime();
        Time = (end - start) / 1000000L;
        System.out.println(Arrays.toString(arr));
        System.out.println("Time taken is: " + Time + " ms");
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low + 1, e = high;

        int pivot = nums[low];

        while (s <= e) {

            while (pivot >= nums[s]) {
                s++;
            }
            while (pivot < nums[e]) {
                e--;
            }

            swap(nums, s, e);

        }
        swap(nums, s, e);
        swap(nums, low, e);

        sort(nums, low, e - 1);
        sort(nums, e + 1, high);


    }
    static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
