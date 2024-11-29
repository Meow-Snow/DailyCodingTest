import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>();
        String targetStr = "ad";
        for (String str : strArr) {
            if (!str.contains(targetStr)) {
                strList.add(str);
            }
        }
        
        String[] answer = new String[strList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = strList.get(i);
        }
        
        return answer;
    }
}