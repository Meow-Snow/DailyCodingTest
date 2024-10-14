import java.util.*;

class Solution {
    public int[] solution(int n, int[] numArr) {
        List<Integer> numList = new ArrayList<>();
        for (int num : numArr) {
            if (num % n != 0) continue;
            numList.add(num);
        }
        
        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
            
        return answer;
    }
}