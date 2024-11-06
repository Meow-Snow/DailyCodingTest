class Solution {
    public int[] solution(int[] arr, int n) {
        int init = (arr.length % 2 != 0)?  0 : 1;
        for (int i = init; i < arr.length; i += 2) {
            arr[i] += n;
        }
        
        return arr;
    }
}