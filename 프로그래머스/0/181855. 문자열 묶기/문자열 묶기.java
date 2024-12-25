class Solution {
    public int solution(String[] strArr) {
        int[] strLenArr = new int[100000];
        for (String str : strArr) {
            strLenArr[str.length()]++;
        }
        
        int answer = 0;
        for (int strLen : strLenArr) {
            answer = Math.max(answer, strLen);
        }
        
        return answer;
    }
}