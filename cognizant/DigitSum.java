public class DigitSum{
    static int digitsSum(int num){
        num=Math.abs(num);
        int sum=0;
        while(num>0){
            sum+=num%10;
            num /=10;
        }
        return sum;
    }
    static int DigitSumAlgo(int[] arr){
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;
        for(int num:arr){
            int sum =digitsSum(num);
            minSum=Math.min(minSum,sum);
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum-minSum;
    }
    public static void main(String[] args) {
        int[] arr={123,45,6,78,9};
        System.out.println(DigitSumAlgo(arr));
    }
}