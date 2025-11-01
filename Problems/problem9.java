public class problem9{
    public static void algo1(String str,String search){
        search = search.toLowerCase();
        str=str.toLowerCase();
        
        int index = str.indexOf(search);
        boolean found = false;
        System.out.println(found);
        System.out.println(index);

        while(index!=-1){
            System.out.println("the substring found at the index of " + index);
            found = true;
            index = str.indexOf(search,index+1);
        }
        System.out.println(found);
    }
    public static void algo2(String str){
        str=str.toLowerCase();
        int count =0;
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length-2;i++){
            if(ch[i]=='u'){
                if(ch[i+1]=='s'){
                    if(ch[i+2]=='a'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String []args){
        String str = "Nikhil is in  usa and capital of usa is california";
        String search  = "usa";
        algo1(str,search);
        algo2(str);
        
    }
}

