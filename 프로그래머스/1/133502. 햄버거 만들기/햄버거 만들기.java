class Solution {
    private static final String PATTERN = "1231";
    private static final int lenP = PATTERN.length();
    
    public int solution(int[] ingredients) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for (int ingredient : ingredients) {
            sb.append(ingredient);
            
            int lenSB = sb.length();            
            if (lenSB >= lenP && sb.substring(lenSB - lenP, lenSB).equals(PATTERN)) {
                sb.delete(lenSB - lenP, lenSB);
                answer++;
            }
        }
        
        return answer;
    }
}