import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] numArr = String.valueOf(n).toCharArray();
        Arrays.sort(numArr);
        
        return Long.parseLong(new StringBuilder(String.valueOf(numArr)).reverse().toString());
    }
}