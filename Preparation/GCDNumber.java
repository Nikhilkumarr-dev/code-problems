//to find the greatest common Factor(HCF)!
public class GCDNumber{
    static int gcd(int a,int b){
        int result = Math.min(a,b);
        while(result>0){
            if(a%result==0 & b%result==0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args){
        int a = 21,b=6;
        System.out.println(gcd(a,b));
    }
}