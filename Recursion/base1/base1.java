public class base1{

    public static int recursion(int a){
        int b=0;
        int sum =0;
        if(a==0)
        {
            return 0;
        }
        else{
             b  =  recursion(a-1);
             sum += b;
        }
        return sum;
    }

    public static void main(String[] args){
        recursion(23);
    }
}