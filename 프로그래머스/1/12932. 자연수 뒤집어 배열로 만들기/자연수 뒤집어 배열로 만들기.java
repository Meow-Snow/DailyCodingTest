class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        int idx = num.length() - 1;
        for (char digit : num.toCharArray()) {
            answer[idx--] = Character.getNumericValue(digit);
        }
        
        return answer;
    }
}



// 스트림을 사용하면 간결한 코드만으로 해결할 수 있다
// import java.util.*;

// class Solution {
//     public int[] solution(long n) {
//         return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
//     }
// }