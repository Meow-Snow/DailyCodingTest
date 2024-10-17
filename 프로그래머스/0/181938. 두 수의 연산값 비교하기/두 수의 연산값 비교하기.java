class Solution {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(new StringBuilder(String.valueOf(a)).append(b).toString()), 2 * a * b);
    }
}