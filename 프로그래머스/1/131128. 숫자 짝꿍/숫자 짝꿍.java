class Solution {
    public String solution(String X, String Y) {
        int[] numCntArrX = getNumCntArr(X);
        int[] numCntArrY = getNumCntArr(Y);        
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(numCntArrX[i], numCntArrY[i]); j++) {
                sb.append(i);
            }
        }
                
        return (sb.length() == 0)? "-1" : (sb.charAt(0) == '0')? "0" : sb.toString();
    }
    
    private int[] getNumCntArr(String nums) {
        int[] numCntArr = new int[10];
        for (char num : nums.toCharArray()) {
            numCntArr[Character.getNumericValue(num)]++;
        }
        
        return numCntArr;
    }
}



// 숫자를 숫자형 문자로 변환하는 법
// 1. Character.forDigit(digit, radix);
// 2. (char) ('0' + digit);

// 숫자형 문자를 숫자로 변환하는 법
// 1. Character.getNumericValue(digitChar);
// 2. (int) (digitChar - '0');

// Map을 이용한 풀이 : Array를 이용했을 때보다 처리속도가 느리고, 코드가 약간 더 복잡해진다
// import java.util.*;

// class Solution {
//     public String solution(String X, String Y) {
//         Map<Character, Integer> numCntMapX = getNumCntMap(X);
//         Map<Character, Integer> numCntMapY = getNumCntMap(Y);
        
//         StringBuilder sb = new StringBuilder();
//         for (int i = 9; i >= 0; i--) {
//             int numCntX = numCntMapX.getOrDefault(Character.forDigit(i, 10), 0);
//             int numCntY = numCntMapY.getOrDefault((char) ('0' + i), 0);
//             for (int j = 0; j < Math.min(numCntX, numCntY); j++) {
//                 sb.append(i);
//             }
//         }
                
//         return (sb.length() == 0)? "-1" : (sb.charAt(0) == '0')? "0" : sb.toString();
//     }
    
//     private Map<Character, Integer> getNumCntMap(String nums) {
//         Map<Character, Integer> numCntMap = new HashMap<Character, Integer>();
//         for (char num : nums.toCharArray()) {
//             numCntMap.put(num, numCntMap.getOrDefault(num, 0) + 1);
//         }
        
//         return numCntMap;
//     }
// }