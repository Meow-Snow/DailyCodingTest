class Solution {
    private String[] cmd = {"w", "s", "d", "a"};
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        String temp = "";
        
        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i - 1]) {
                    case 1 -> temp = cmd[0];
                    case -1 -> temp = cmd[1];
                    case 10 -> temp = cmd[2];
                    case -10 -> temp = cmd[3];
            }
            
            sb.append(temp);
        }
        
        return sb.toString();
    }
}