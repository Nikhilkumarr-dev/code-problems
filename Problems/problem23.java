import java.util.*;
public class problem23{
    public static  int Algo(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    
}
    public static void main(String []args){
        String str ="abcdbcab"; //abcdbcab->abc,bcd,cdb,cab,abcd-4
        int n=Algo(str);
        System.out.println(n);


    }
}

//public class problem231 {
//     public static void main(String[] args) {
//         String str = "abcdbcab"; // Example input
//         String longest = ""; //{empty string}
//         int maxLength = 0; //0

//         // Outer loop starts the substring
//         for (int i = 0; i < str.length(); i++) { //a
//             String temp = "";//string "null" 

//             // Inner loop expands the substring
//             for (int j = i; j < str.length(); j++) { //a //b {sandeep}=str.indexOf(e)==-1
//                 char c = str.charAt(j); //a //b

//                 // If character already exists in substring, stop
//                 if (temp.indexOf(c) != -1) { //temp.indexOf(c)==0 true,
//                     break;
//                 }

//                 // Add character to substring
//                 temp += c; //temp="a" "b"

//                 // Update longest if this substring is longer
//                 if (temp.length() > maxLength) { //1>0 1>0
//                     maxLength = temp.length();  //maxlength=1; 1;
//                     longest = temp; //longest ="a,b"
//                 }
//             }
//         }

//         System.out.println("Longest substring without repeating characters: " + longest);
//         System.out.println("Length: " + maxLength);
//     }
// }

