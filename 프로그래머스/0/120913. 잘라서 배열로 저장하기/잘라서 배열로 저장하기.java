class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.ceil((double) my_str.length() / n)];
        int idx = 0;
        for (int i = 0; i < my_str.length(); i += n) {
            answer[idx++] = my_str.substring(i, Math.min(my_str.length(), i + n));
        }
        
        return answer;
    }
}