class Solution {
    public int solution(int a, int b) {
        return Math.max(concat(a, b), concat(b, a));
    }
    
    private int concat(int a, int b) {
        return Integer.parseInt(new StringBuilder(String.valueOf(a)).append(b).toString());
    }
}