class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int idx1 = (n == 1)? 0 : slicer[0];
        int idx2 = (n == 2)? num_list.length - 1 : slicer[1];
        int step = (n == 4)? slicer[2] : 1;
        
        int[] answer = new int[(idx2 - idx1) / step + 1];
        int idx = 0;
        for (int i = idx1; i <= idx2; i += step) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}



// class Solution {
//     private static int startIdx, endIdx, interval = 1;
//     public int[] solution(int n, int[] slicer, int[] num_list) {
//         int[] startIdxArr = {0, slicer[0], slicer[0], slicer[0]};
//         int[] endIdxArr = {slicer[1], num_list.length - 1, slicer[1], slicer[1]};
//         int[] intervalArr = {1, 1, 1, slicer[2]};
        
//         int startIdx = startIdxArr[n - 1];
//         int endIdx = endIdxArr[n - 1];
//         int interval = intervalArr[n - 1];
                
//         int[] answer = new int[(endIdx - startIdx) / interval + 1];
//         for (int i = 0; i < answer.length; i++) {
//             answer[i] = num_list[startIdx + interval * i];
//         }
        
//         return answer;
//     }
// }