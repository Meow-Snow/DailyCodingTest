class Solution {
    private static int startIdx, endIdx, interval = 1;
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] startIdxArr = {0, slicer[0], slicer[0], slicer[0]};
        int[] endIdxArr = {slicer[1], num_list.length - 1, slicer[1], slicer[1]};
        int[] intervalArr = {1, 1, 1, slicer[2]};
        
        int startIdx = startIdxArr[n - 1];
        int endIdx = endIdxArr[n - 1];
        int interval = intervalArr[n - 1];
                
        int[] answer = new int[(endIdx - startIdx) / interval + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[startIdx + interval * i];
        }
        
        return answer;
    }
}