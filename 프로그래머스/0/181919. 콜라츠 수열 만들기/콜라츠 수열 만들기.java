import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> collatzSequence = new ArrayList<>();
        collatzSequence.add(n);        
        while (n != 1) {
            n = (n % 2 == 0)? n / 2 : 3 * n + 1;            
            collatzSequence.add(n);
        }
        
        int[] answer = new int[collatzSequence.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = collatzSequence.get(i);
        }
        
        return answer;
    }
}