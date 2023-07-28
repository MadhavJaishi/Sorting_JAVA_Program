import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr) {
        //Kunal's Solution
       int i = 0;
       while(i < arr.length){
           int correct = arr[i]-1;
           if (arr[i] != arr[correct]) {
               Swap(arr, i, correct);
           } else {
               i++;
           }
       }
        //My Solution
//        for (int i = 0; i < arr.length; i++) {
//            while(arr[i] != i+1) {
//                Swap(arr, i, arr[i]-1);
//            }
//        }
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
