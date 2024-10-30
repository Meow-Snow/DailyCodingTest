class Solution {
    public int solution(int[] nums) {
        int answer = 0;        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrimeNum(nums[i] + nums[j] +nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    private boolean isPrimeNum(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}