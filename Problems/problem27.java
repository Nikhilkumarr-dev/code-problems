
import java.util.Arrays;
public class problem27{
    public static int algorithm(int[] arr,int k){
        int length = arr.length;
        Arrays.sort(arr);
        return arr[length-k];
    }
    public static void main(String []args){
        int[] arr={13,43,2,4,5,6,8,12,17};
        int k =2;
        int solution = algorithm(arr,k);
        System.out.println(solution);
}
}