class Solution {
    public int[] solution(int[] arr, int k) {
        return (k % 2 != 0)? getOddArr(arr, k) : getEvenArr(arr, k);
    }
    
    private int[] getOddArr(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= k;
        }
        
        return arr;
    }
    
    private int[] getEvenArr(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += k;
        }
        
        return arr;
    }
}