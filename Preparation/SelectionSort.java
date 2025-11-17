import java.util.Arrays;
public class SelectionSort{
    public static int[] SelectionSortAlgo(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j; //1
                }
            }
                  int temp=arr[i];//->
                  arr[i]=arr[minIndex];
                  arr[minIndex]=temp;
        }
        return arr;
    }
    public static void main(String []args){
        int arr[] = {1,23,45,6,7,8};
        int result[] = SelectionSortAlgo(arr);
        System.out.println(Arrays.toString(result));
    }
}