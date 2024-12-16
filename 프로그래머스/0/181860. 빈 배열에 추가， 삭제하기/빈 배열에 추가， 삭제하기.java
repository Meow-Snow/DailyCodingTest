import java.util.*;

class Solution {
    public Integer[] solution(int[] arr, boolean[] flag) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                if (flag[i]) {
                    numList.add(arr[i]);
                    numList.add(arr[i]);
                } else {
                    numList.remove(numList.size() - 1);
                }
            }
        }
        
        return numList.toArray(Integer[]::new);
    }
}