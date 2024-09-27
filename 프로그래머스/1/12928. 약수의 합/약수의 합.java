class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        int sum = (n % sqrt == 0)? (int) sqrt : 0;
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0) {
                sum += (i + n / i);
            }
        }
        
        return sum;
    }
}