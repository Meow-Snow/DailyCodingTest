import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> strList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                strList.add(String.valueOf(c));
            }
        }
        
        Collections.sort(strList);
        
        return String.join("", strList);
    }
}