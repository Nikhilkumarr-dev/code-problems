
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem30{
    public static int[] topKFrequentElements(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:arr){
           map.put(n,map.getOrDefault(n, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i);
        }
        return result;
    }
        public static void main(String []args){
        int arr[] = {1,2,2,3,4,4,4,5,6,7,8,8,8,8,9};
        int k = 3;
        int result[] = topKFrequentElements(arr,k);
        System.out.println(Arrays.toString(result));
    }
}