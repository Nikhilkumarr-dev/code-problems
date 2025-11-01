public class problem16{
    public static void main(String []args){
        String str = "I am 25 years and 10 months old";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                sb.append(ch);
            }   
        }
        System.out.println(sb);
    }
}