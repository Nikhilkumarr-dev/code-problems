public class LinearSearch{
    public static void main(String[] args){
        int arr[]={4,3,57,8,99,90,6};
        int target= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("the element found at" + i);
            }else{
                System.out.println("the element not found");
            }
        }
    }
}