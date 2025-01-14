import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> idMap = new HashMap<>();
        for (String[] data : db) {
            idMap.put(data[0], data[1]);
        }
        
        return !idMap.keySet().contains(id_pw[0])? "fail" : idMap.get(id_pw[0]).equals(id_pw[1])? "login" : "wrong pw";
    }
}