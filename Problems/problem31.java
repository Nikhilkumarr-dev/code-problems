import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class problem31{
    public static void main(String []args){
        String[] str = {"eat","ate","tea","race","care","save","vase"};
       HashMap<String,List<String>> map = new HashMap<>();

       for(String word:str){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        if(!map.containsKey(sorted)){
            map.put(sorted,new ArrayList<>());
        }
        map.get(sorted).add(word);
       }
       for(List<String> group:map.values()){
        System.out.println(group);
       }
    }
}