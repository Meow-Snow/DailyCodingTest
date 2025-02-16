import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        
        return Math.max(numbers[0] * numbers[1], numbers[len - 1] * numbers[len - 2]);
    }
}