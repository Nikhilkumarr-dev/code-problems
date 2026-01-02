import java.util.ArrayList;
import java.util.List;

public class SumCombo {

    public static void CombinationSum(int arr[],int i,List<Integer> ans,List<List<Integer>> ans1,int target){
        if(target==0){
            ans1.add(new ArrayList(ans));
            return;
        }
        if(i==arr.length || target<0){
            return;
        }
        ans.add(arr[i]);
        CombinationSum(arr, i, ans, ans1, target-arr[i]);
        ans.remove(ans.size()-1);
        CombinationSum(arr, i+1, ans, ans1, target);
    }
    public static void main(String[] args) {
        int[] arr={2,3,5};
        int target=8;
        int i=0;
        ArrayList<Integer> ans = new ArrayList<>();
        List<List<Integer>> ans1= new ArrayList<>();
        CombinationSum(arr,i,ans,ans1,target);
        System.out.println(ans1);
    }
}
