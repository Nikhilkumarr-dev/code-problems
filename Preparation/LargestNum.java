public class LargestNum{
    public static void main(String []args){
        int n1 = 9;
        int n2 = 0;
        int n3 = 8;
        if(n1>n2 && n1>n3){
            System.out.println("the largest number is " + n1);
        }else if(n2>=n3 && n3>=n1){
            System.out.println("the largest number is" + n2);
        }else{
            System.out.println("The largest number is" + n3);
        }
    }
}