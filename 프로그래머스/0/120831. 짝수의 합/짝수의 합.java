class Solution {
    public int solution(int n) {
        return n / 2 * (n / 2 + 1);
    }
}



// class Solution {
//     public int solution(int n) {
//         int sum = 0;
//         for (int i = 2; i <= n; i += 2) sum += i;
        
//         return sum;
//     }
// }