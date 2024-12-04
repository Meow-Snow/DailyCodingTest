class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer1 = new int[len];
        int[] answer2 = new int[len];
        
        System.arraycopy(numbers, 0, answer1, 1, len - 1);
        answer1[0] = numbers[len - 1];
        System.arraycopy(numbers, 1, answer2, 0, len - 1);
        answer2[len - 1] = numbers[0];
        
        return (direction.equals("right"))? answer1 : answer2;
    }
}