class Solution {
    public int solution(int n, int m, int[] sections) {
        int answer = 0;
        int paintRange = -1;
        for (int section : sections) {
            if (section > paintRange) {
                answer++;
                paintRange = section + m - 1;
            }
        }        
        
        return answer;
    }
}