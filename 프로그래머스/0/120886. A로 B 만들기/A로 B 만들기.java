class Solution {
    public int solution(String before, String after) {
        int[] alphabets = new int[26];        
        for (char c : before.toCharArray()) {
            alphabets[c - 'a']++;
        }
        
        for (char c : after.toCharArray()) {
            if (alphabets[c - 'a'] < 1) return 0;
            else alphabets[c - 'a']--;
        }
        
        return 1;
    }
}