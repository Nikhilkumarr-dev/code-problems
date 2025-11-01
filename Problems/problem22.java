import java.util.*;
public class problem22{
    public static void main(String []args)
    {
      int arr[]={11, 45, 8, 23, 14, 12, 78, 45, 89};
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=0;i<3;i++){
        list.add(arr[i]);
      }
      System.out.println("The first Chunk in the list "+list);
      Collections.reverse(list);
      System.out.println("reversing the first chunk of the list "+list); 
      list.clear();  
      for(int i=3;i<6;i++){
        list.add(arr[i]);
      } 
      System.out.println("The second chunk in the list "+list);
      Collections.reverse(list);
      System.out.println("Reversing the second chunk of the list "+list);
      list.clear();
      for(int i=6;i<arr.length;i++){
        list.add(arr[i]);

      }
      System.out.println("The third chunk of the list "+list);
      Collections.reverse(list);
      System.out.println("Reversing the third chunk of the list "+list);
      list.clear();
    }
}