// Selection Sort works by dividing the array into two parts — the sorted part at the beginning and the unsorted part.
// In each step, we find the smallest element from the unsorted part and swap it with the first element of the unsorted part.
// This keeps expanding the sorted portion one element at a time until the whole array is sorted.\
import java.util.Arrays;
public class SelectionSort{
    public static int[] selectionSortAlgo(int[] arr) {
        if (arr.length > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i; 
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j; 
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
    public static void main(String []args){
        int arr[] = {3,4,5,1};
        int result[] = selectionSortAlgo(arr);
        System.out.println(Arrays.toString(result));
        }
}