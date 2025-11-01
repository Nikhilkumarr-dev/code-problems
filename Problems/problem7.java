public class problem7 {
    public static String Algo(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;               
        int j = s2.length() - 1; 

        while (i < s1.length() && j >= 0) {
            sb.append(s1.charAt(i)); // take char from s1
            sb.append(s2.charAt(j)); // take char from s2
            i++;
            j--;
        }
        while (i < s1.length()) {
            sb.append(s1.charAt(i));
            i++;
        }
        while (j >= 0) {
            sb.append(s2.charAt(j));
            j--;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "orange";
        String result = Algo(s1, s2);
        System.out.println(result);
    }
}
