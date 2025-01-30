class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        return getSimplified(numer1 * denom2 + numer2 * denom1, denom1 * denom2);
    }
    
    private int[] getSimplified(int numer, int denom) {
        for (int i = 2; i <= Math.min(numer, denom); i++) {
            if (numer % i == 0 && denom % i == 0) {                
                int[] fraction = getSimplified(numer / i, denom / i);
                numer = fraction[0];
                denom = fraction[1];
                break;
            }
        }
        
        return new int[]{numer, denom};
    }
}