package  Recursion;
public class sumArray{
    public static int solve(int[] arr,int i){
        if(i==arr.length){
            return 0;
        }
        return arr[i]+ solve(arr,i+1);//1,34,5,56,6,7,8 reaching length
    }
    public static void main(String[] args){
        int[] arr={1,34,5,56,6,7,8};
        int result = solve(arr,0);
        System.out.println(result);
    }
}
