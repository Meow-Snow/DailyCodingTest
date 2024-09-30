class Solution {
    public int[] solution(int[] num_list) {
        int numOdd = 0;
        int numEven = 0;
        
        for (int num : num_list) {
            if (num % 2 == 0) numEven++;
            else numOdd++;
        }
        
        return new int[]{numEven, numOdd};
    }
}