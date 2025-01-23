class Solution {
    public int solution(int[] array) {
        int[] countArr = new int[1000];
        for (int num : array) {
            countArr[num]++;
        }
        
        int target = 0;
        int max = 0;
        int secMax = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] >= max) {
                secMax = max;
                max = countArr[i];
                target = i;
            }
        }
        
        return (max == secMax)? -1 : target;
    }
}