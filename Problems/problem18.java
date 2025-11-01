public class problem18{
    public static  String middleChar(String str){
        int length=str.length();
        char ch[]=str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=length-1;i++){
            if(i==((length/2)-1)){ //S
                sb.append(ch[i]);
            }else if(i==(length/2)){
                sb.append(ch[i]); //O
            }else if(i==(length/2)+1){
                sb.append(ch[i]);//N
            }

        }
        return sb.toString();
    }
    public static String middleChar2(String str){
        int length=str.length();
        int middle=length/2;
        //from-to //s,o,n ->middle-1,middle,middle+1
        //i<5
        return str.substring(middle-1,middle+2);
    }
    public static void main(String []args){
        String str = "JaSonAy";
        String result = middleChar(str);
        System.out.println(result);
        String result2 = middleChar2(str);
        System.out.println(result2);
    }
}
