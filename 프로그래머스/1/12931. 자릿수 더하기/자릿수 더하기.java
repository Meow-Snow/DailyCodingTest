public class Solution {
    public int solution(int n) {
        int sum = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }
}