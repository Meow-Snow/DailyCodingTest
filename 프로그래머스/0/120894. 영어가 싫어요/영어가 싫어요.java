class Solution {
    private static final String[] nums = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public long solution(String numbers) {
        for (int i = 0; i < nums.length; i++) {
            numbers = numbers.replace(nums[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}