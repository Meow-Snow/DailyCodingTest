class Solution {
    public int solution(int n) {
        int sum = 0;
        switch (n % 2) {
            case 0 -> {
                for (int i = 2; i <= n; i += 2) sum += i * i;
            }
            default -> {
                for (int i = 1; i <= n; i += 2) sum += i;
            }
        }
        
        return sum;
    }
}