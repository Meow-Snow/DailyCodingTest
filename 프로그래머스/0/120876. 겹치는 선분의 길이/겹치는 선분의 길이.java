class Solution {
    public int solution(int[][] lines) {
        boolean[] overlaps = new boolean[200];
        for (int i = 0; i < lines.length - 1; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                for (int k = Math.max(lines[i][0], lines[j][0]); k < Math.min(lines[i][1], lines[j][1]); k++) {
                    overlaps[k + 100] = true;
                }
            }
        }
        
        int answer = 0;
        for (boolean overlap : overlaps) {
            if (overlap) answer++;
        }
        
        return answer;
    }
}