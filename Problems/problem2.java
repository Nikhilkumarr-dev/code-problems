public class problem2{
    public static String middleOfThree(String str){
        if(str.length()==0){
            return str;
        }
        if(str.length()==1)
        {
            return str;
        }
        int length = (str.length()/2)-1;
        char c1 = str.charAt(length);
        char c2 = str.charAt(length+1);
        char c3 = str.charAt(length+2);

        return ""+c1+c2+c3;
    }
    public static String middleOfThree_substring(String str) {
    if (str == null || str.length() < 3) return str;
    int mid = str.length() / 2;             // middle index
    return str.substring(mid - 1, mid + 2); // [mid-1, mid+2)
    }

    public static void main(String []args){
        String str = "NikhilKum";
        String result = middleOfThree(str);
        String result2 = middleOfThree_substring(str);
        System.out.println(result);
        System.out.println(result2);

    }
}