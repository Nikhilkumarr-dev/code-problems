import java.util.Arrays;
public class BubbleSort{
    public static int[] BubbleSortAlgo(int[] arr){
        if(arr.length>0){
            for(int i=0;i<arr.length;i++){//4,1,0,4,9
            System.out.println(arr[i]);
                for(int j=0;j<arr.length-1;j++){//4,1,2,0,9,10
                    if(arr[j]>arr[j+1]){        //1,2,0,4,9,10
                        int temp = arr[j];      //1,0,2,4,9,10
                        arr[j]=arr[j+1];        //0,1,2,4,9,10
                        arr[j+1]=temp;          //0,1,2,4,9,10
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String []args){
        int arr[] = {4,9,1,2,0,10};
        int result[] = BubbleSortAlgo(arr);
        System.out.println(Arrays.toString(result));
    }
}