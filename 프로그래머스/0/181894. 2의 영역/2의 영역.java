import java.util.Arrays;

class Solution {
    private static final int target = 2;
    
    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = arr.length;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                firstIdx = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                lastIdx = i;
                break;
            }
        }        
        
        return (firstIdx == -1)? new int[]{-1} : Arrays.copyOfRange(arr, firstIdx, lastIdx + 1);
    }
}