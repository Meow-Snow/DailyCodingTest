import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer[]> rankList = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) rankList.add(new Integer[]{rank[i], i});
        }
        
        Collections.sort(rankList, ((a, b) -> Integer.compare(a[0], b[0])));
        
        return rankList.get(0)[1] * 10000 + rankList.get(1)[1] * 100 + rankList.get(2)[1];
    }
}