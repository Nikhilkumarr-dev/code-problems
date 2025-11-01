import java.util.ArrayList;
import java.util.List;
public class problem21{
    public static void main(String []args){
        // Given list
        List<Integer> list1 = new ArrayList<>();
        list1.add(54);
        list1.add(44);
        list1.add(27);
        list1.add(79);
        list1.add(91);
        list1.add(41);
        System.out.println(list1);

        int element = list1.remove(4);//removes the element at index==4
        System.out.println("List After removing element at index 4: " + list1);
        
        list1.add(2, element);//adds at the element at index==2
        System.out.println("List after adding element at index 2: " + list1);
        
        list1.add(element);//this method makes to add element at last of the the array
        System.out.println("List after adding element at last: " + list1);
    }
}