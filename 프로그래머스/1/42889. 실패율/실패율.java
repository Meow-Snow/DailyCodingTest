import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] playersUncleared = new int[N + 1];        
        for (int stage : stages) {
            playersUncleared[stage - 1]++;
        }
        
        int[] playersArrived = new int[N + 1];
        int total = 0;
        for (int i = N; i > 0; i--) {
            total += playersUncleared[i];
            playersArrived[i - 1] += playersUncleared[i - 1] + total;
        }
        
        double[][] failureRate = new double[N][2];
        for (int i = 0; i < N; i++) {
            failureRate[i][0] = i + 1;
            failureRate[i][1] = (playersArrived[i] == 0)? 0 : (double) playersUncleared[i] / playersArrived[i];
        }
        
        Arrays.sort(failureRate, (a, b) -> Double.compare(b[1], a[1]));                    
                    
        int[] answer = new int[N];        
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failureRate[i][0];
        }
        
        return answer;
    }
}