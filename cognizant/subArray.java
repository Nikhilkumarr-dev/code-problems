public class subArray {

    public static int subArrayAlgo(int[] arr){
        int count=0;
        for(int i=0;i<=arr.length-3;i++){ //-->
            int a=arr[i];
            int b=arr[i+1];
            int c=arr[i+2];
            int value=a+c;
            if(value==b){
                count++;
            }
        }
    return count;  
    }
    public static void main(String []args){
        int arr[] ={1,3,2,3,1,5,4,9};//-->1,3,2,
        int result = subArrayAlgo(arr);
        System.out.println(result);        
    }
}
