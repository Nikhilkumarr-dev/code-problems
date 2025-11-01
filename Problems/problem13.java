//split in the string
import java.util.Arrays;

public class problem13{
    public static void main(String[] args){
        String str = "Emma-is-a-datascientist";
        String[] subStrings=str.split("-");
        System.out.println(Arrays.toString(subStrings));
        for(String s:subStrings){
            System.out.println(s);
        }
}
}