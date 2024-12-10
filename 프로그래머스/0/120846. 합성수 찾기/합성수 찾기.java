class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (getDivCnt(i) >= 3) answer++;
        }
        
        return answer;
    }
    
    private int getDivCnt(int number) {
        int divCnt = 0;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) divCnt += 2;
        }
        
        return (int) Math.sqrt(number) == Math.sqrt(number)? divCnt + 1 : divCnt;
    }
}