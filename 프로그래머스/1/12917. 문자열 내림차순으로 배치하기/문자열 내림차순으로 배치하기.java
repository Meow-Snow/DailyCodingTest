import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        return new StringBuilder(String.valueOf(charArr)).reverse().toString();
    }
}