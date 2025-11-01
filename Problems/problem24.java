import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem24 {

    public static int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : arr) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(
                        merged.get(merged.size() - 1)[1],
                        interval[1]
                );
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };
        int[][] result = merge(arr);
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
// import java.util.*;

// public class problem23 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // Read number of intervals
//         System.out.println("enter the number");
//         int n = sc.nextInt();
//         int[][] intervals = new int[n][2];
//         // Read intervals
//         for (int i = 0; i < n; i++) {
//             intervals[i][0] = sc.nextInt(); // start
//             intervals[i][1] = sc.nextInt(); // end
//         }
        
//         // Sort intervals by starting time
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
//         List<int[]> merged = new ArrayList<>();
//         int[] current = intervals[0];
        
//         for (int i = 1; i < n; i++) {
//             if (intervals[i][0] <= current[1]) {
//                 // Overlapping — merge
//                 current[1] = Math.max(current[1], intervals[i][1]);
//             } else {
//                 // No overlap — add current to result and move on
//                 merged.add(current);
//                 current = intervals[i];
//             }
//         }
//         merged.add(current); // add last interval
        
//         // Print result
//         System.out.println("Merged intervals:");
//         for (int[] interval : merged) {
//             System.out.println(interval[0] + " " + interval[1]);
//         }
//         sc.close();
//     }
// }