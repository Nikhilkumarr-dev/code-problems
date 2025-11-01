public class problem1{
    public static String makeNewString(String string){
        int length = string.length();
        char first = string.charAt(0);
        char middle = string.charAt(length/2);
        char last = string.charAt(length-1);
        return ""+first+middle+last;
    }
    public static String makeNewString1(String str) {
    int len = str.length();
    if (len == 0) return "";       // handle empty string
    if (len == 1) return str;      // single character string

    StringBuilder sb = new StringBuilder(3);
    sb.append(str.charAt(0));              // first
    sb.append(str.charAt(len / 2));        // middle
    sb.append(str.charAt(len - 1));        // last

    return sb.toString();
}

    public static void main(String []args){
        String string = "Nikhil";
        String result = makeNewString(string);
        String result1 = makeNewString1(string);
        System.out.println(result);
        System.out.println(result1);
    }
}