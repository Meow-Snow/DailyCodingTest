class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for (int num : array) {
            int diff = Math.abs(num - n);
            
            if (diff < minDiff || (diff == minDiff && num < answer)) {
                answer = num;
                minDiff = diff;
            }
        }
        
        return answer;
    }
}