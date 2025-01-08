class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">") && n > m) return 1;
        else if (ineq.equals("<") && n < m) return 1;
            
        return (eq.equals("=") && n == m)?  1 : 0;
    }
}