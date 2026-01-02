public class subStringConst {
    public static String subString(String str){
        StringBuilder sb = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String []args){
        String str = "erudjcjkldlde";
        String result = subString(str);
        System.out.println(result);

    }
}
