class Solution {
    public int[] solution(int[] arr) {
        int radix = 0;
        while (Math.pow(2, radix++) < arr.length) {}        
        
        int[] answer = new int[(int) Math.pow(2, radix - 1)];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}