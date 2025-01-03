import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] prevArr = new int[arr.length];
        while (!Arrays.equals(prevArr, arr)) {
            prevArr = arr.clone();
            arr = convertArray(arr);
            answer++;            
        }
        
        return answer;
    }
    
    private int[] convertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
            else if (arr[i] < 50 && arr[i] % 2 != 0) arr[i] = arr[i] * 2 + 1;
        }
        
        return arr;
    }
}