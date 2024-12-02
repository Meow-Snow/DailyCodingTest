import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) divisorList.add(i);
        }
        divisorList.add(n);
        
        int[] answer = new int[divisorList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = divisorList.get(i);
        }
        
        return answer;
    }
}