public class problem32 {
    public static void main(String[] args) {
        int[] arr={5,2,78,54,9,6};
        int target=8;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              int sum = arr[i]+arr[j];
              if(sum==target){
                System.out.println("equal");
                System.out.println(arr[i]+" "+arr[j]);
                count++;
              }
            }
        }if(count==0){
            System.out.println("not equal");
        }
    }
}