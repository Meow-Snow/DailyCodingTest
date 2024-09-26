class Solution {
    public int solution(int angle) {
        return switch (angle) {
            case 90 -> 2;
            case 180 -> 4;
            default -> (angle < 90)? 1 : 3;
        };
    }
}



// class Solution {
//     public int solution(int angle) {
//         return (angle < 90)? 1 : (angle == 90)? 2 : (angle == 180)? 4 : 3;
//     }
// }