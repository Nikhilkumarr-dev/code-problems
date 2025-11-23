
import java.util.HashSet;

public class DuplicateArray{
    static int arrayDup(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
            set.add(arr[i]);
        }
        }
        System.out.println(set.toString());
        return set.size();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,6,7,8,8};
        int solution = arrayDup(arr);
       
    }
}