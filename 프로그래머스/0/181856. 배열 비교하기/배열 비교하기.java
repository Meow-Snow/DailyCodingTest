class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int sum1 = getSum(arr1);
            int sum2 = getSum(arr2);
            
            return (sum1 > sum2)? 1 : (sum1 < sum2)? -1 : 0;
        }
        
        return (arr1.length > arr2.length)? 1 : -1;
    }
    
    private int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
}