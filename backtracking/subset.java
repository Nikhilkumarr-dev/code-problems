import java.util.ArrayList;
import java.util.List;
public class subset {
    static void printSubSet(int[] arr,ArrayList<Integer> ans,int i){
        if(i==arr.length){
            for(Object val : ans){
                System.out.print(val+" ");
            }
            System.out.println("");
            return;
        }
        ans.add(arr[i]);
        printSubSet(arr, ans, i+1);
        ans.remove(ans.size()-1);//backtracking
        printSubSet(arr, ans, i+1);
    }
    //printing fall charcter combinations
    static void printSubSetForString(String str,List<Character> ans,int i){
        if(i==str.length()){
            for (Character elem : ans) {
                System.out.print(elem);
            }
            System.out.println("");
            return;
        }
        ans.add(str.charAt(i));
        printSubSetForString(str, ans, i+1);
        ans.remove(ans.size()-1);
        printSubSetForString(str, ans, i+1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        String name = "nikh";
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Character> ans1 = new ArrayList<>();
        printSubSet(arr,ans,0);
        printSubSetForString(name,ans1,0);
    }    
}
