public class problem4{
    public static String middleCharString(String str1,String str2){
        int length1=str1.length();
        System.out.println(length1);
        int length2=str2.length();
        System.out.println(length2);

        char c1 = str1.charAt(0);
        char c2 = str1.charAt((length1-1)/2);
        char c3 = str1.charAt(length1-1);

        char c4 = str2.charAt(0);
        char c5=str2.charAt((length2-1)/2);
        char c6=str2.charAt(length2-1);        

        return ""+c1+c2+c3+c4+c5+c6;
    }
    public static String middleChars(String str1,String str2){
        int length1=str1.length();
        System.out.println(length1);
        int length2=str2.length();
        System.out.println(length2);

        char c1 = str1.charAt(0);
        char c2 = str1.charAt((length1-1)/2);
        char c3 = str1.charAt(length1-1);

        char c4 = str2.charAt(0);
        char c5=str2.charAt((length2-1)/2);
        char c6=str2.charAt(length2-1);        

       StringBuilder sb = new StringBuilder();
       sb.append(c1).append(c2).append(c3).append(c4).append(c5).append(c6);
       return sb.toString();
    }
    public static void main(String []args){
        String str1 = "Nikhil";
        String str2 = "Kumar";
        String result = middleCharString(str1,str2);
        String result2 = middleChars(str1, str2);
        System.out.println(result);
        System.out.println(result2);
}
}