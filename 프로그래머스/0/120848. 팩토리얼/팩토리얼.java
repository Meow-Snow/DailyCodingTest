class Solution {
    public int solution(int n) {
        int answer = 1;
        int factorial = 1;
        while (factorial <= n) {
            answer++;
            factorial *= answer;
        }
        
        return answer - 1;
    }
}



// class Solution {
//     public int solution(int n) {
//         int product = 1;
//         for (int i = 1; i <= 11; i++) {
//             product *= i;
//             if (product > n) return i - 1;
//         }
        
//         return -1;
//     }
// }