// 10진수를 radix진수로 변환 : Integer.toString(int 10진수, int radix);
// radix진수를 10진수로 변환 : Integer.parseInt(String radix진수, int radix);

class Solution {
    public int[] solution(String s) {        
        int[] answer = new int[2];
        int prev, cur;
        while (!s.equals("1")) {
            prev = s.length();
            cur = s.replace("0", "").length();            
            answer[0]++;
            answer[1] += prev - cur;            
            s = Integer.toString(cur, 2);
        }        
        
        return answer;
    }
}