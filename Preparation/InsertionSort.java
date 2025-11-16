import java.util.Arrays;

public class InsertionSort{
    public static int[] InsertionSortAlgo(int[] arr){
        for(int i=0;i<arr.length;i++){ //2 //3 //8 //5 //1 //0 ->Sorts one elemnet across the array.
            int j=i;                    //0 //1 //2 //3 //4 //5
            while(j>0 && arr[j]<arr[j-1]){  // 2,3,8,5,1,0,9 -->  2,3,5,8,1,0,9 -->2,3,5,1,8,0,9 -->2,3,1,5,8,0,9-->2,1,3,5,8,0,9 -->1,2,3,5,8,0,9 --> 1,2,3,5,0,8,8 -->1,2,3,0,5,8,9 -->1,2,0,3,5,8,9-->1,0,2,3,5,8,9 -->0,1,2,3,5,8,9
                int temp = arr[j]; 
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String []args){
        int arr[] = {2,3,8,5,1,0,9};
        int result[] = InsertionSortAlgo(arr);
        System.out.println(Arrays.toString(result));
    }
}