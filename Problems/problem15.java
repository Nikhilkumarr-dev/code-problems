public class problem15{
    public static void algo(String str){
        char ch[]=str.toCharArray();
        String result="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' || ch[i]==' '){
                result=result+ch[i];
            }
        }
        System.out.println(result);
    }
    public static void main(String []args)
    {
        String str = "/*Jon is @developer & musician";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)||Character.isWhitespace(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        algo(str);
    }
}