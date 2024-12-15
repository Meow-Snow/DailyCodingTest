import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<String> strList = new ArrayList<>();
        for (String str : my_string.split("")) {
            if (!strList.contains(str)) strList.add(str);
        }
        
        return String.join("", strList);
    }
}