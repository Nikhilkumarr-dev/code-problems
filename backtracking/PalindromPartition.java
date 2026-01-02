import java.util.ArrayList;
import java.util.List;

public class PalindromPartition{

    static boolean isPalindrome(String str){
        if(str.length()==0){
            return false;
        }
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    
    }
    static void getAllParitions(String str,List<String> partition,List<List<String>> ans){
        if(str.length()==0){
            ans.add(new ArrayList<>(partition));
            return;
        }
        for(int i=0;i<str.length();i++){
            String part=str.substring(0,i+1);
            if(isPalindrome(part)){
                partition.add(part);
                getAllParitions(str.substring(i+1), partition, ans);
                partition.remove(partition.size()-1);
            }
        }
        
    }
    public static void main(String[] args) {
        String str = "aab";
        List<String> partition = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        getAllParitions(str,partition,ans);
        System.out.println(ans);

    }
}