class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] uniformArr = new int[n];        
        for (int num : lost) {
            uniformArr[num - 1]--;
        }
        
        for (int num : reserve) {
            uniformArr[num - 1]++;
        }
        
        for (int i = 0; i < uniformArr.length; i++) {
            if (i != 0 && uniformArr[i] < 0 && uniformArr[i - 1] >= 1) {
                uniformArr[i]++;
                uniformArr[i - 1]--;
            } else if (i != uniformArr.length - 1 && uniformArr[i] < 0 && uniformArr[i + 1] >= 1) {
                uniformArr[i]++;
                uniformArr[i + 1]--;
            }
        }
        
        int answer = 0;
        for (int uniform : uniformArr) {
            if (uniform >= 0) answer++;
        }
        
        return answer;
    }
}