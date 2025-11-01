public class problem17{
    public static void main(String []args){
        String str = "Emma25 is Data scientist50 and AI Expert";
        String[] word = str.split(" ");//{"emma25","is","Data","scientist50",...};
        for(String words:word){ //"emma25"
            boolean hasLetter =false;
            boolean hasDigit = false;
            for(char ch:words.toCharArray()){ //e
                if(Character.isLetter(ch)){ //hasLetter = true
                    hasLetter=true;
                }else if(Character.isDigit(ch)){
                    hasDigit=true; //hasDigit=true;
                }
            }
            if(hasDigit && hasLetter){
                System.out.println(words);
            }
        }
    }
}