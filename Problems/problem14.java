
import java.util.ArrayList;

public class problem14{
    public static void main(String []args){
        ArrayList<String> ls = new ArrayList<>();
        ls.add("Emma");
        ls.add("Jon");
        ls.add("");
        ls.add("Kelly");
        ls.add(null);
        ls.add("Eric");
        ls.add("");
        ArrayList<String> list = new ArrayList<>();
        for(String ns:ls){
            if("".equals(ns) || ns==null){
                break;
            }
            else{
                list.add(ns);
            }
        }
        System.out.println(list);
    }
}