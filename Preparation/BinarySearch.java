import java.util.Arrays;
public class BinarySearch{
    public static int BinarySearchAlgo(int[] arr,int target){
        int low = arr[0];
        int high = arr.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(target==arr[mid]){
                System.out.println("the element found at "+ mid);
                return mid;
            }
            if(target>arr[mid])
            {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return target;
    }
    public static void main(String[] args) {
        int arr[]={4,1,3,6,7,8,9,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 9;
        int result = BinarySearchAlgo(arr,target);
        System.out.println(result);
    }
}