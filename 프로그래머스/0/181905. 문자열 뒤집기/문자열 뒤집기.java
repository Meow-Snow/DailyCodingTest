class Solution {
    public String solution(String my_string, int s, int e) {
        String reversed = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
            
        return new StringBuilder(my_string).replace(s, e + 1, reversed).toString();
    }
}