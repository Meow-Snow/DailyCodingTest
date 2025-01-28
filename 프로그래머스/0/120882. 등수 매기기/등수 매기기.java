import java.util.*;

class Solution {
    public int[] solution(int[][] scores) {
        Map<Double, Double> meanMap = new HashMap<>();
        for (int[] score : scores) {
            double mean = (score[0] + score[1]) / 2.0;
            meanMap.put(mean, meanMap.getOrDefault(mean, (double) 0) + 1);
        }
        
        List<double[]> meanList = new ArrayList<>();
        for (double key : meanMap.keySet()) {
            meanList.add(new double[]{key, meanMap.get(key)});
        }
        
        Collections.sort(meanList, (a, b) -> Double.compare(b[0], a[0]));
        
        double cnt = 1;
        for (double[] meanArr : meanList) {
            meanMap.put(meanArr[0], cnt);
            cnt += meanArr[1];
        }
                
        int[] answer = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            answer[i] = meanMap.get((scores[i][0] + scores[i][1]) / 2.0).intValue();
        }
                
        return answer;
    }
}