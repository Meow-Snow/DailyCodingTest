import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        List<Integer> numList = new ArrayList<>();
        for (int num : num_list) {
            numList.add(num);
        }
        
        return numList.contains(n)? 1 : 0;
    }
}