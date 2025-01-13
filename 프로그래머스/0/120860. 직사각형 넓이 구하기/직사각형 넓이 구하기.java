class Solution {
    public int solution(int[][] dots) {
        int[] dxMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] dyMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (int[] dot : dots) {
            dxMax[0] = Math.min(dxMax[0], dot[0]);
            dxMax[1] = Math.max(dxMax[1], dot[0]);
            dyMax[0] = Math.min(dyMax[0], dot[1]);
            dyMax[1] = Math.max(dyMax[1], dot[1]);
        }
        
        return Math.abs(dxMax[1] - dxMax[0]) * Math.abs(dyMax[1] - dyMax[0]);
    }
}



// class Solution {
//     public int solution(int[][] dots) {
//         int mnhtDist = 0;
//         int[] pos = dots[0];
//         for (int[] dot : dots) {
//             mnhtDist = Math.max(Math.abs(dot[0] - dots[0][0]) + Math.abs(dot[1] - dots[0][1]), mnhtDist);
//         }
        
//         return (mnhtDist / 2) * (mnhtDist / 2);
//     }
// }