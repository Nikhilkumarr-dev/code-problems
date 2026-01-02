

import java.util.HashMap;
import java.util.Map;

public class FrequencyDiff {
    static int freqDiff(String str){
        Map<Character,Integer> map = new HashMap();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int MaxFreq=Integer.MIN_VALUE;
        int MinFreq=Integer.MAX_VALUE;
        for(int freq:map.values()){
            MaxFreq=Math.max(MaxFreq,freq);
            MinFreq=Math.min(MinFreq,freq);
        }
        return MaxFreq-MinFreq;
    }
    public static void main(String[] args){
        String str = "aabbbbcc";
        int result = freqDiff(str);
        System.out.println(result);

    }
}
