// 조금 더 숙고했다면 더 간단한 코드로 해결할 수 있었다
class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = r; i < code.length(); i += q) {
            sb.append(code.charAt(i));
        }
        
        return sb.toString();
    }
}



// class Solution {
//     public String solution(int q, int r, String code) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < code.length(); i++) {
//             if (i % q == r) sb.append(code.charAt(i));
//         }
        
//         return sb.toString();
//     }
// }