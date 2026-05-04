package code.practice;

import java.util.*;


public class LongestSubString {
    public static int lengthofLongestSubString(String s){
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left=0, maxLen =0;
        for(int right=0; right<s.length(); right++){
            char c= s.charAt(right);

            if(lastSeen.containsKey(c) && lastSeen.get(c) >=left){
                left = lastSeen.get(c)+1;
            }
            lastSeen.put(c, right);
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthofLongestSubString("abcabcbb"));
    }
}
