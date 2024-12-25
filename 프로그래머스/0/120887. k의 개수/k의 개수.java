class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        for (int n = i; n <= j; n++) {
            sb.append(n);
        }
        
        return sb.length() - sb.toString().replace(String.valueOf(k), "").length();
    }
}



// class Solution {
//     public int solution(int i, int j, int k) {
//         int answer = 0;
//         for (int n = i; n <= j; n++) {
//             for (char c : String.valueOf(n).toCharArray()) {
//                 if (Character.getNumericValue(c) == k) answer++;
//             }
//         }
        
//         return answer;
//     }
// }