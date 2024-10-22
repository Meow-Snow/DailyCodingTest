class Solution {
    public int solution(int[] box, int n) {
        int maxCnt = 1;
        for (int length : box) {
            maxCnt *= length / n;
        }
        
        return maxCnt;
    }
}



// class Solution {
//     public int solution(int[] box, int n) {        
//         return (box[0] / n) * (box[1] / n) * (box[2] / n);
//     }
// }