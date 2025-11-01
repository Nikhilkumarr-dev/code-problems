
import java.util.ArrayList;
import java.util.List;

public class problem20{
    public static void main(String []args){
        int arr[] = {3, 6, 9, 12, 15, 18, 21};
        int arr1[]={4, 8, 12, 16, 20, 24, 28};
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        List<Integer> ls3=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                ls1.add(arr[i]);
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(i%2==0){
                ls2.add(arr1[i]);
            }
        }
        ls3.addAll(ls1);//pre-defined methods
        ls3.addAll(ls2);//pre-defined methods
        System.out.println(ls1);
        System.out.println(ls2);
        System.out.println(ls3); 
    }
}