public class problem12{
    public static void main(String []args){
        String str = "dkjaklj sakds emma jadlkjasdk emma emma emma";
        String searchString = "emma";
        int index = str.lastIndexOf(searchString);//-1
        //indexPosition
        while(index!=-1){
            System.out.println(index);
            break;
        }

    }
}