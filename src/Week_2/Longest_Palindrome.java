package Week_2;

import java.util.HashSet;
import java.util.Set;

public class Longest_Palindrome {
    public static void main(String[] args){
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome1(s));
    }

    private static int longestPalindrome1(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }

    private static int longestPalindrome(String s) {
        if (s==null || s.length() == 0){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int count = 0;
        char[] ch = s.toCharArray();
        for (char c: ch){
            if (set.remove(c)){
                count++;
            }else {
                set.add(c);
            }
        }
        return s.isEmpty()? count*2 : count*2+1;
    }
}
