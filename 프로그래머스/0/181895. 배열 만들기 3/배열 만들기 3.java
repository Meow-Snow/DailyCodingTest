class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int intv1 = intervals[0][1] - intervals[0][0] + 1;
        int intv2 = intervals[1][1] - intervals[1][0] + 1;
        int[] answer = new int[intv1 + intv2];
        
        System.arraycopy(arr, intervals[0][0], answer, 0, intv1);
        System.arraycopy(arr, intervals[1][0], answer, intv1, intv2);
        
        return answer;
    }
}