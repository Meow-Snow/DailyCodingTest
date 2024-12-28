class Solution {
    private static final String target = "Z";
    public int solution(String s) {
        int answer = 0;
        String prev = "";
        for (String str : s.split(" ")) {
            if (str.equals(target)) answer -= Integer.parseInt(prev);
            else answer += Integer.parseInt(str);
            
            prev = str;
        }
        
        return answer;
    }
}