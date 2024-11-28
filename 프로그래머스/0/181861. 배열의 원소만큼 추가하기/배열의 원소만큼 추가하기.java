import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                numList.add(num);
            }
        }
        
        int[] answer = new int[numList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}