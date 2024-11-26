import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> numList = new ArrayList();
        for (int num : arr) {
            numList.add(num);
        }
        
        for (int num : delete_list) {
            numList.remove(Integer.valueOf(num));
        }
        
        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}