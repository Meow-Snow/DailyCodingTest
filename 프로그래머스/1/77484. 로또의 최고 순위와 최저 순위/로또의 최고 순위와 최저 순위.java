import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> win_numList = new ArrayList<>();
        for (int win_num : win_nums) {
            win_numList.add(win_num);
        }
        
        int[] answer = new int[2];
        for (int num : lottos) {
            if (num == 0) answer[0]++;
            else if (win_numList.contains(num)) answer[1]++;
        }
        
        answer[0] += answer[1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = getRank(answer[i]);
        }
        
        return answer;
    }
    
    private int getRank(int num) {
        return (num > 1)? 7 - num : 6;
    }
}