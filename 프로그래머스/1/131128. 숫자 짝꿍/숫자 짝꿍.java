class Solution {
    public String solution(String X, String Y) {
        int[] numCntArrX = getNumCntArr(X);
        int[] numCntArrY = getNumCntArr(Y);        
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(numCntArrX[i], numCntArrY[i]); j++) {
                sb.append(i);
            }
        }
                
        return (sb.length() == 0)? "-1" : (sb.charAt(0) == '0')? "0" : sb.toString();
    }
    
    private int[] getNumCntArr(String nums) {
        int[] numCntArr = new int[10];
        for (char num : nums.toCharArray()) {
            numCntArr[Character.getNumericValue(num)]++;
        }
        
        return numCntArr;
    }
}