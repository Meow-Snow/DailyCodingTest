import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int[] numArr = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(numArr);
            
            answer[idx++] = numArr[command[2] - 1];
        }
        
        return answer;
    }
}