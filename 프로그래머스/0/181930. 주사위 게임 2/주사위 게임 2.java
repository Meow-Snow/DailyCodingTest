class Solution {
    public int solution(int a, int b, int c) {
        int powSum1 = getPowSum(a, b, c, 1), powSum2 = getPowSum(a, b, c, 2), powSum3 = getPowSum(a, b, c, 3);
        
        if (a != b && b != c && c != a) {
            return powSum1;
        } else if (a == b && b == c) {
            return powSum1 * powSum2 * powSum3;
        } else {
            return powSum1 * powSum2;
        }
    }
    
    private int getPowSum(int base1, int base2, int base3, int exponent) {
        return (int) (Math.pow(base1, exponent) + Math.pow(base2, exponent) + Math.pow(base3, exponent));
    }
}