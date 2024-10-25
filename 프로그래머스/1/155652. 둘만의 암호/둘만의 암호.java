class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 'a'; i <= 'z'; i++) {
            char c = (char) i;
            if (!skip.contains(String.valueOf(c))) sb.append(c);
        }
        
        String validAlphabets = sb.toString();
        sb.setLength(0);
        for (char c : s.toCharArray()) {
            int startIdx = validAlphabets.indexOf(c);
            sb.append(validAlphabets.charAt((startIdx + index) % validAlphabets.length()));
        }
        
        return sb.toString();
    }
}