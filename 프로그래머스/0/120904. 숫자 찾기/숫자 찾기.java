class Solution {
    public int solution(int num, int k) {        
        char[] numArr = String.valueOf(num).toCharArray();
        for (int i = 0; i < numArr.length; i++) {
            if (Character.getNumericValue(numArr[i]) == k) {
                return i + 1;
            }
        }
        
        return -1;
    }
}