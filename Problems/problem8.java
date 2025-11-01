public class problem8{
    public static boolean BalanceStringAlgo(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            System.out.println(s2.indexOf(ch));
            if(s2.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        String str1 = "Apple";
        String str2 = "bcgfha";
        boolean result = BalanceStringAlgo(str1,str2);
        System.out.println(result);
   }
}