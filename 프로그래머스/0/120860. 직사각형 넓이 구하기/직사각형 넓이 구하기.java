class Solution {
    public int solution(int[][] dots) {
        int[] delta = new int[2];
        int[] maxDelta = new int[2];
        
        for (int i = 1; i < dots.length; i++) {
            delta = new int[]{Math.abs(dots[0][0] - dots[i][0]), Math.abs(dots[0][1] - dots[i][1])};
            if (maxDelta[0] + maxDelta[1] < delta[0] + delta[1]) {
                maxDelta = delta;
            }
        }
        
        return maxDelta[0] * maxDelta[1];
    }
}



// class Solution {
//     public int solution(int[][] dots) {
//         int[] dxMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};
//         int[] dyMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};
//         for (int[] dot : dots) {
//             dxMax[0] = Math.min(dxMax[0], dot[0]);
//             dxMax[1] = Math.max(dxMax[1], dot[0]);
//             dyMax[0] = Math.min(dyMax[0], dot[1]);
//             dyMax[1] = Math.max(dyMax[1], dot[1]);
//         }
        
//         return Math.abs(dxMax[1] - dxMax[0]) * Math.abs(dyMax[1] - dyMax[0]);
//     }
// }