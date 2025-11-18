public class Freq{
    public static void main(String[] args){
        String str ="Nikhil";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                int count=0;
                char ch1=str.charAt(j);
                if(ch == ch1){
                    count++;
                    System.out.println("the character is " +  ch + " " +  count);
                }
            }
        }
    }
}