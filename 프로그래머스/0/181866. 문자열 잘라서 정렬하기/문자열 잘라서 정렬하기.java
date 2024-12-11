import java.util.*;

class Solution {
    public String[] solution(String myString) {        
        List<String> strList = new ArrayList<>();
        for (String str : myString.split("x")) {
            if (!str.trim().isEmpty()) strList.add(str);
        }
        
        Collections.sort(strList);
        
        return strList.toArray(new String[0]);
    }
}