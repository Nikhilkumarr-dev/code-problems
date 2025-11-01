public class problem6{
    public static void main(String []args){
        String str = "Nikhil@@@786565";
        int letters=0,digits=0,special=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                digits += 1;
            }
            else if(Character.isLetter(ch)){
                letters += 1;
            }else{
                special++;
            }
        }
        System.out.println("No of letter sare " + letters);
        System.out.println("No of digits are "+digits);
        System.out.println("No of special characters are "+special);
    }
}