class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int vidLen = parseTimeToSec(video_len);
        int opStart = parseTimeToSec(op_start);
        int opEnd = parseTimeToSec(op_end);
        
        int curPos = skipOpening(opStart, opEnd, parseTimeToSec(pos));
        
        for (String command : commands) {
            if (command.equals("prev")) {
                curPos = (curPos - 10 < 0)? 0 : curPos - 10;
            } else if (command.equals("next")) {
                curPos = (curPos + 10 > vidLen)? vidLen : curPos + 10;
            }
            
            curPos = skipOpening(opStart, opEnd, curPos);
        }
        
        return String.format("%02d:%02d", curPos / 60, curPos % 60);
    }
    
    private int parseTimeToSec(String time) {
        String[] minSec = time.split(":");
        
        return 60 * Integer.parseInt(minSec[0]) + Integer.parseInt(minSec[1]);
    }
    
    private int skipOpening(int opStart, int opEnd, int curPos) {
        return (opStart <= curPos && curPos < opEnd)? opEnd : curPos;
    }
}