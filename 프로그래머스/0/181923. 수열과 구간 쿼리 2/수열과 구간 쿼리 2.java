import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> numList = new ArrayList<>();
        for (int[] query : queries) {
            int min = Integer.MAX_VALUE;
            for (int i = query[0]; i <= query[1]; i++) {
                if (arr[i] > query[2]) min = Math.min(min, arr[i]);
            }
            numList.add((min == Integer.MAX_VALUE)? -1 : min);
        }
        
        return numList.stream().mapToInt(i -> i).toArray();
    }
}