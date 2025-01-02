class Solution {
    public int[] solution(String s) {        
        int[] answer = new int[2];
        String prev;
        while (!s.equals("1")) {
            prev = s;
            s = s.replace("0", "");
            
            answer[0]++;
            answer[1] += prev.length() - s.length();
            
            s = String.valueOf(Integer.toString(Integer.valueOf(s.length()), 2));
        }        
        
        return answer;
    }
}