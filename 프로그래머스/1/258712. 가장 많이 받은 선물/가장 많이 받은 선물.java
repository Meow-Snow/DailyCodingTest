import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> idMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) idMap.put(friends[i], i);

        HashMap<String, int[]> giftMap = new HashMap<>();
        for (String friend : friends) giftMap.put(friend, new int[friends.length]);

        int[] giftIdxArr = new int[friends.length];
        for (String gift : gifts) {
            String[] exchangers = gift.split("\\s+");
            giftMap.get(exchangers[0])[idMap.get(exchangers[1])]++;
            giftIdxArr[idMap.get(exchangers[0])]++;
            giftIdxArr[idMap.get(exchangers[1])]--;
        }

        int maxGiftCnt = 0;
        for (int i = 0; i < friends.length; i++) {
            int giftCnt = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue;                
                int giveCnt = giftMap.get(friends[i])[j];
                int takeCnt = giftMap.get(friends[j])[i];
                if (giveCnt > takeCnt || giveCnt == takeCnt && (giftIdxArr[i] > giftIdxArr[j])) giftCnt++;
            }         
            maxGiftCnt = Math.max(maxGiftCnt, giftCnt);
        }

        return maxGiftCnt;
    }
}