public class MaxSumOfSubArray {
    public static int MaxArray(int[] arr, int k){
        int sum=0;
        for(int i=0;i<arr.length-k;i++){
            int sum1=arr[i]+arr[i+1]+arr[i+2];
            if(sum1>sum){
                sum=sum1;
            }
        }
        return sum;
    }
    public static void main(String []args){
        int arr[]={2,34,56,7,4,5,6,7};
        int k=3;
        int result=MaxArray(arr,k);
        System.out.println(result);
    }
}
