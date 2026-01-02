public class MaxSubArray{
    //kandane's algorithm
    public static int MaxSum(int[] arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum+= arr[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int [] arr={2,3,-9,-1,5,-12,7,-17,9};
        int result=MaxSum(arr);
        System.out.println(result);
        int maxSum=0;
        for(int st=0;st<arr.length;st++){
            int currSum=0;
            for(int en=st;en<arr.length;en++){
                currSum += arr[en];
                maxSum=Math.max(currSum,maxSum);
            }
        }
       System.out.println(maxSum);
    }
}