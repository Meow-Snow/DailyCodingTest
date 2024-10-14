import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length - 1];
        int prev = num_list[num_list.length - 2];
        int[] answer = Arrays.copyOfRange(num_list, 0, num_list.length + 1);        
        answer[answer.length - 1] = (last > prev)? last - prev : last * 2;
            
        return answer;
    }
}