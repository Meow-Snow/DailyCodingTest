class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        if (direction.equals("right")) {
            System.arraycopy(numbers, 0, answer, 1, len - 1);
            answer[0] = numbers[len - 1];            
        } else {
            System.arraycopy(numbers, 1, answer, 0, len - 1);
            answer[len - 1] = numbers[0];            
        }        
        
        return answer;
    }
}