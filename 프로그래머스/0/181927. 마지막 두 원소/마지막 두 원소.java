import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOfRange(num_list, 0, num_list.length + 1);
        int len = answer.length;
        answer[len - 1] = (answer[len - 2] > answer[len - 3])? answer[len - 2] - answer[len - 3] : answer[len - 2] * 2;
            
        return answer;
    }
}