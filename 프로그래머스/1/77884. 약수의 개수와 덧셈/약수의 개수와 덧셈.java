class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += (countDivisors(i) % 2 == 0)? i : -1 * i;
        }
        
        return sum;
    }
    
    private int countDivisors(int num) {
        int divCnt = 0;
        double sqrt = Math.sqrt(num);
        for (int i = 1; i < sqrt; i++) {
            if (num % i == 0) divCnt += 2;
        }
        
        return (sqrt == (int) sqrt)? divCnt + 1 : divCnt;
    }
}