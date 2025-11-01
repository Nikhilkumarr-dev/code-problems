public class problem10{
    public static double  algo(String str){
        double sum =0;
        double count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += ch-'0';
                count++;
            }
        }
        if (count ==0){
            System.out.println(count);
        }else{
            double average = (double)sum/count;
            System.out.println("the average is" + average);
        }
        return sum;
    }
    public static void main(String[] args) {
        String str ="876strigng jdkfd 896";
        double result = algo(str); 
        System.out.println(result);
    }
}