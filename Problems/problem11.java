import java.util.Map;
import java.util.TreeMap;
public class problem11{
    public static void NumberOfOccureneces(String s){
        Map<Character,Integer> map = new TreeMap<>();//hash map can be also implemented
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
    public static void NumberOfOccurence1(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(char ch1:str.toCharArray()){
                if(ch==ch1){
                    count++;
                    System.out.println(ch+""+count);
                }else{
                    count=1;
                    System.out.println(ch+""+count);
                }
            }
        }
    }
    public static void main(String []args){
        String str = "Apple";
        NumberOfOccureneces(str);
        NumberOfOccurence1(str);
    }
}