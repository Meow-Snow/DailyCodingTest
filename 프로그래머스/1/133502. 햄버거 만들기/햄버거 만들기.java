class Solution {
    private static final String PATTERN = "1231";
    
    public int solution(int[] ingredients) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for (int ingredient : ingredients) {
            sb.append(ingredient);
            
            if (sb.length() >= 4 && sb.substring(sb.length() - 4, sb.length()).equals(PATTERN)) {
                sb.delete(sb.length() - 4, sb.length());
                answer++;
            }
        }
        
        return answer;
    }
}