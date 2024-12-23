class Solution {
    public int solution(int n) {
        int product = 1;
        for (int i = 1; i <= 11; i++) {
            product *= i;
            if (product > n) return i - 1;
        }
        
        return -1;
    }
}