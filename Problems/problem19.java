public class problem19{
    public static void main(String []args){
        String str = "'/*Jon is @developer & musician!!'";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isLetter(ch) && !Character.isWhitespace(ch)){
                sb.append('#');
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }
}