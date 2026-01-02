import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation{
    static void printPermutation(int[] arr,List<Integer> ans,int idx){
        if(idx == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=idx;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
            printPermutation(arr, ans, idx+1);
            temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        printPermutation(arr,list,0);
    }
}