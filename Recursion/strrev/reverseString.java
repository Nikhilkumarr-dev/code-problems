public class reverseString{

    public static void solve(String str,int index){
        if(index>=str.length()){
            return;
        }
        solve(str,index+1);
        System.out.print(str.charAt(index));
    }

    public static void main(String[] args){
        String str1 = "abc";
        int length=str1.indexOf('a');
        solve(str1,length);
    }
}