class Solution {
    public int solution(int[] sides) {
        return Math.min(sides[0], sides[1]) * 2 - 1;
    }
}



// class Solution {
//     public int solution(int[] sides) {
//         return sides[0] + sides[1] - Math.abs(sides[0] - sides[1]) - 1;
//     }
// }