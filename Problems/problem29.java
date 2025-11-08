import java.util.Arrays;
public class problem29{
    public static int algo(int[] arr,int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        
        dp[0]=0;
        for(int i:dp){
            System.out.println(i);
        }
        for(int coins:arr){
            for(int i=coins;i<=amount;i++){
                dp[i]=Math.min(dp[i],dp[i-coins]+1);
            }
        }
        return dp[amount]>amount?-1: dp[amount];
    }
    public static void main(String []args){
        int[] arr = {1,2,5};
        int amount = 21;
        int result = algo(arr,amount);
        System.out.println("Minimum coins needed are " + result);
    }
}