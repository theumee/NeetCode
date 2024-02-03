package ArraysAndHashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(!sCount.containsKey(s.charAt(i))) sCount.put(s.charAt(i), 1);
            else sCount.put(s.charAt(i), sCount.get(s.charAt(i)) + 1);
            if(!tCount.containsKey(t.charAt(i))) tCount.put(t.charAt(i), 1);
            else tCount.put(t.charAt(i), tCount.get(t.charAt(i)) + 1);
        }

        for(Character k: sCount.keySet()){
            if(!Objects.equals(sCount.get(k), tCount.get(k))) return false;
        }

        return true;
    }

    public static boolean isAnagramPartTwo(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        s = String.valueOf(sArray);
        t = String.valueOf(tArray);


        return s.equals(t);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "namagra"));
        System.out.println(isAnagramPartTwo("anagram", "namagra"));
    }
}
