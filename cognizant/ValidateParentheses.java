import java.util.Stack;

public class ValidateParentheses {

    static boolean isValidWithOneMismatch(String s) {
        
        int balance =0;
        int mistake=0;
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(ch=='('){
                balance++;
            }else if(ch==')'){
                balance--;
                if(balance<-1){
                    return false;
                } 
            }else{
                mistake++;
                if(mistake>1){
                    return false;
                }
            }
        }
        mistake += balance;

        return mistake<=1;
    }

    public static void main(String[] args) {
        String s = "())";

        boolean result = isValidWithOneMismatch(s);
        System.out.println("Result: " + result);
    }
}

