import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] termArr = term.split(" ");
            termMap.put(termArr[0], Integer.parseInt(termArr[1]));
        }
        
        List<Integer> expiredInfoList = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            if (convertToDays(today) >= convertToDays(privacy[0]) + termMap.get(privacy[1]) * 28) {
                expiredInfoList.add(i + 1);
            }
        }
        
        int[] answer = new int[expiredInfoList.size()];
        for (int i = 0; i < expiredInfoList.size(); i++) {
            answer[i] = expiredInfoList.get(i);
        }
        
        return answer;
    }
    
    private int convertToDays(String ymd) {
        String[] ymdArr = ymd.split("\\.");
        
        return (Integer.parseInt(ymdArr[0]) * 12 + Integer.parseInt(ymdArr[1])) * 28 + Integer.parseInt(ymdArr[2]);
    }
}