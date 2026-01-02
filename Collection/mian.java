import java.util.*;
import java.util.Map.*;
public class mian{
    static void List()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//add,remove,get,clear
        list.add(3);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(1, 20);
        System.out.println(list);
        list.remove(0);  
        list.clear(); //to delete all
        list.remove(Integer.valueOf(10));
        int a = list.size();
        System.out.println(a);
    }
    static void LinkedList(){
        LinkedList<String> list1 = new LinkedList<>();//inserting middle and end is easy
        list1.add("apple");//o(1)-->TC 
        list1.add("orange");
        list1.add("banana");
        list1.addFirst("Nikhil");
        list1.addLast("Kumar");
        System.out.println(list1);
        list1.get(1);
        list1.getLast();
        list1.getFirst();
        list1.removeFirst();
        list1.removeLast();
        list1.remove();
        for(String x:list1){
            System.out.println(list1);
        }

    }
    static  void HashMap(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Nikhil");
        map.put(2,"Kumar");//latest value
        map.put(3,"Und");
        map.put(4,"Sandeep");
        map.put(5,"Kumar");
        map.put(2,"telangana");
        map.put(3,":kumar");
        System.out.println(map);
        
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1,"Nikhil");
        map1.put(2,"Kumar");
        map.put(2,"Sandeep");
        map.put(3,"kumar");
        System.out.println(map1);

        Map<Integer,Integer> map2 = new TreeMap<>();
        map2.put(1,3);//sort the keys according to asec order
        map2.put(5,7);
        map2.put(2,10);
        System.out.println(map2);
    }
    static void HashSet(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(5);
        set.add(5);
        System.out.println(set);
    }
    public static void main(String[] args){
        // mian.List();
        // mian.LinkedList();
        // mian.HashMap();
        mian.HashSet();

    }
}