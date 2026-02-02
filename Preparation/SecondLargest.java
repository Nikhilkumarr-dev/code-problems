import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 5};
        
        Arrays.sort(arr); 
        int secondLargest = arr[arr.length - 2]; 
        System.out.println("Second Largest: " + secondLargest);
    }
}
