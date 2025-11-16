import java.util.Arrays;
public class BubbleSort{
    public static int[] BubbleSortAlg(int arr[]){
        if(arr.length>0){
            for(int i=0;i<arr.length;i++) //1,
            {
                System.out.println(arr[i]);
            for(int j=0;j<arr.length-i-1;j++){ //1,
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
        }
        return arr;
    }
    public static void main(String []args){
        int arr[]={1,6,57,2,3,45,65,6,7,3,4,2,1};
        int result[]=BubbleSortAlg(arr);
        System.out.println(Arrays.toString(result));

    }
}