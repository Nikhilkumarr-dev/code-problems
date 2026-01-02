//quick Sort algorithm

public class sortAlgo {
    public static void QuickSort(int[] arr,int start,int end){
        if(start<end){
            int pivIdx=partition(arr,start,end);
            QuickSort(arr, start,pivIdx-1);
            QuickSort(arr,pivIdx+1,end);
        }
    }
    public static int partition(int[] a,int start,int end){
        int idx=start-1 ,pivot=a[end];
        for(int j=start;j<end;j++){
            if(a[j]<=pivot){
                idx++;
                int temp=a[idx];
                a[idx]=a[j];
                a[j]=temp;
            }
        }
        idx++;
        int temp=a[idx];
        a[idx]=a[end];
        a[end]=temp;
        return idx;
    }
    public static void main(String []args){
        int [] arr={5,3,6,4,1,};
        int start=0;
        int end = arr.length-1;
        QuickSort(arr,start,end);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
