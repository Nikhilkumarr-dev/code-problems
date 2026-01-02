public class sumOfEven {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            {
                even += arr[i];
            }else{
                odd+=arr[i];
            }
        }
        if(even>odd){
            System.out.println("even is greater than odd " + even + " "+ odd);
        }
        else{
            System.out.println("Even and odd sum are not equal " + even  + odd);
        }
    }
}
