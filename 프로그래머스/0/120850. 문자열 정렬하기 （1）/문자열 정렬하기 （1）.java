import java.util.*;

class Solution {
    public Integer[] solution(String my_string) {
        List<Integer> numList = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numList.add(Character.getNumericValue(c));
            }
        }
        
        Collections.sort(numList);
        
        return numList.toArray(Integer[]::new);
    }
}