public class LinearSearch{
    public static int LinearSearchImp(int arr[],int target){
        if(arr.length==1){
            return arr[0];
        }
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }
    return 0;
    }
    public static void main(String []args){
        int arr[]={1,23,4,56,7,9};
        int target=65;
        int result = LinearSearchImp(arr,target);
        System.out.println(result);
    }
}