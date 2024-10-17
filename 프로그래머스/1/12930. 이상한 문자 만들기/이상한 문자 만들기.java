class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int wordIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char num = (wordIdx++ % 2 == 0)? Character.toUpperCase(c) : Character.toLowerCase(c);
            answer.append(num);
            
            if (c == ' ') wordIdx = 0;
        }
        
        return answer.toString();
    }
}