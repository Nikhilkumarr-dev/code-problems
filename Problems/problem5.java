public class problem5{
    public static void main(String ars[]){
        String str = "NikHil";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();    
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(ch);
            }else{
                sb1.append(ch);
            }

        }
        StringBuilder sb3 = new StringBuilder();
        sb1.toString();
        sb.toString();
        sb3.append(sb).append(sb1);
        System.out.println(sb3);
    }
}