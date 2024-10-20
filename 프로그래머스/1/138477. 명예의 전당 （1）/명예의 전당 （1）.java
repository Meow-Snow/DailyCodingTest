import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(0);
        
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j <= k; j++) {
                if (score[i] >= scoreList.get(j)) {
                    scoreList.add(j, score[i]);
                    break;
                }
            }
            
            answer[i] = (i < k)? scoreList.get(i) : scoreList.get(k - 1);
        }
        
        return answer;
    }
}