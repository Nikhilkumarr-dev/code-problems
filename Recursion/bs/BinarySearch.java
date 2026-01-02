
public class BinarySearch {
    static int binarySearchAlgo(int[] arr,int left ,int right,int target){
        if(left>right){
            return -1;
        }
        //middle value
        int mid = left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        //target is greateer than left
        if(arr[mid]<target){
            return binarySearchAlgo(arr, mid+1, right, target);
        }
        return binarySearchAlgo(arr, left, mid-1, target);
    }
 public static void main(String[] args){
    int[] arr={2,34,4,5,6,7,7};
    int target =6;
    int result=binarySearchAlgo(arr,0,arr.length-1,target);
    System.out.println(result);
 }   
}
