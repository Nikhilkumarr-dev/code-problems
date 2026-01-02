
import java.util.Arrays;

public class MaxWeight {
    public static int WeightCount(int arr[],int capacity){
        int count=0;
        int sum =0;
        Arrays.sort(arr);
        for(int w :arr){
            if(sum+w<=capacity){
                sum += w;
                count++;
            }
        }
        return count;
    }
    public static void main(String []args){
        int[] weights={21,32,43,56,76,7,8,98};
        int total_capacity= 150;
        int result=WeightCount(weights,total_capacity);
        System.out.println(result);
    }
}
