
import java.util.Arrays;

public class Permutatoin {
    public static String permutationOfVowels(String str){
        String rev="";
        for(char c:str.toCharArray()){
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                rev+=c;
            }
        }
        
        char ch[]=rev.toCharArray();
        Arrays.sort(ch);//ascending order sorting
        
        StringBuilder sb =new StringBuilder();
        sb.append(ch);
        sb.reverse();//(lexicographic order).

        return sb.toString();
      

    }

    public static void main(String[] args) {
        String str = "aebdjdkiouejd";
        String result = permutationOfVowels(str);
        System.out.println(result);
    }
}


//bbbjjkkll
//->9!
//llkkjjbbb