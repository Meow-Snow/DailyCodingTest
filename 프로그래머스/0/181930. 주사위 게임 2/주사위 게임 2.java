class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int cnt = 1;        
        if (a == b || b == c || c == a) cnt++;
        if (a == b && b == c) cnt++;
        
        for (int i = 1; i <= cnt; i++) {
            answer *= getPowSum(a, b, c, i);
        }
        
        return answer;
    }
    
    private int getPowSum(int base1, int base2, int base3, int exponent) {
        return (int) (Math.pow(base1, exponent) + Math.pow(base2, exponent) + Math.pow(base3, exponent));
    }
}