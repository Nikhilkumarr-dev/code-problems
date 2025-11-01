public class BinarySearch{
    public static int BinarySearchAlgo(int arr[],int target){
        if(arr.length==1){
            return arr[0];
        }
        int low = arr[0];
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
    return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,34,5,67,7,8,9,};
        int target =34;
        int result = BinarySearchAlgo(arr,target);
        System.out.println(result);
    }
}