import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> strLenMap = new HashMap<>();
        for (String str : strArr) {
            strLenMap.put(str.length(), strLenMap.getOrDefault(str.length(), 0) + 1);
        }
        
        int answer = 0;
        for (Integer key : strLenMap.keySet()) {
            answer = Math.max(answer, strLenMap.get(key));
        }
        
        return answer;
    }
}



// class Solution {
//     public int solution(String[] strArr) {
//         int[] strLenArr = new int[100000];
//         for (String str : strArr) {
//             strLenArr[str.length()]++;
//         }
        
//         int answer = 0;
//         for (int strLen : strLenArr) {
//             answer = Math.max(answer, strLen);
//         }
        
//         return answer;
//     }
// }