import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] reports, int k) {
        Map<String, Set> reportMap = new HashMap<>();
        Map<String, Set> reportedMap = new HashMap<>();
        for (String id : id_list) {
            reportMap.put(id , new HashSet<String>());
            reportedMap.put(id, new HashSet<String>());
        }        
        
        for (String report : reports) {
            String[] reportArr = report.split(" ");
            String reportId = reportArr[0];
            String reportedId = reportArr[1];
            reportMap.get(reportId).add(reportedId);
            reportedMap.get(reportedId).add(reportId);
        }
        
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            Set<String> reportedIdSet = reportMap.get(id_list[i]);
            for (String reportedId : reportedIdSet) {
                if (reportedMap.get(reportedId).size() >= k) answer[i]++;
            }
        }
        
        return answer;
    }
}