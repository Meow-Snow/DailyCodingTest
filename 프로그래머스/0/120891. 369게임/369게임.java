class Solution {
    private static String clap = "369";
    public int solution(int order) {
        int answer = 0;
        for (char c : String.valueOf(order).toCharArray()) {
            if (clap.contains(String.valueOf(c))) answer++;
        }
        
        return answer;
    }
}