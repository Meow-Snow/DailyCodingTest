class Solution {
    public int[] solution(int[] array) {
        int maxNum = Integer.MIN_VALUE;
        int targetIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                targetIdx = i;
            }
        }
        
        return new int[]{maxNum, targetIdx};
    }
}