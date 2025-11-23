

public class arrayEqual{
    public static void main(String[] args){
        int arr[] = {1,9,5,6,2,3};
        int arr1[] = {5,9,1,6,2,3};
        int count=0;
        // Arrays.equals(arr, arr1);
        for(int i=0;i<arr.length;i++){//Arrays.eqaul(arr,arr1);
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    count++;
                }
            }
        }
        if(count==arr.length || count==arr1.length){
            System.out.println("both arrays are equal");
        }else{
            System.out.println("Both arrays are not equal");
        }
    }
}