import java.util.*;

class Solution {
    public Integer[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> numList = new ArrayList<>();
        for (String intStr : intStrs) {
            int target = Integer.parseInt(new StringBuilder(intStr).substring(s, s + l));
            if (target > k) numList.add(target);
        }
        
        return numList.toArray(Integer[]::new);
    }
}