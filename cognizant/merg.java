import java.util.ArrayList;

public class merg {

    public static void merge(int[] arr,int start,int mid,int end){
        ArrayList<Integer> list = new ArrayList<>();
        int i=start,j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                list.add(arr[i]);
                i++;
            }else{
                list.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            list.add(arr[i]);
            i++;
        }
        while(j<=mid){
            list.add(arr[j]);
            j++;
        }
        for(int idx=0;idx<list.size();idx++)
        {
            arr[idx+start]=list.get(idx);
        }

    }   
    public static void mergeSort(int[] arr,int start,int end){
        int mid=(start+end)/2;
        if(start<end){
            mergeSort(arr, start,mid);
            mergeSort(arr, mid+1, end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args){
        int[] arr={4,6,7,2,3,1};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
