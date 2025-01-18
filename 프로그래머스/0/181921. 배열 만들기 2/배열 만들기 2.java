import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> numList = new ArrayList<>();
        while (l % 5 != 0) l++;
        for (int i = l; i <= r; i += 5) {
            if (isTarget(i)) numList.add(i);
        }
        
        return numList.isEmpty()? new int[]{-1} : numList.stream().mapToInt(i -> i).toArray();
    }
    
    private boolean isTarget(int num) {
        for (char c : String.valueOf(num).toCharArray()) {
            if (c != '0' && c != '5') return false;
        }
        
        return true;
    }
}