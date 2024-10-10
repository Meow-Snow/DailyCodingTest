class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        int idx = num.length() - 1;
        for (char digit : num.toCharArray()) {
            answer[idx--] = Character.getNumericValue(digit);
        }
        
        return answer;
    }
}