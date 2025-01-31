class Solution {
    private static final int[] primeFactors = {2, 5};
    
    public int solution(int a, int b) {
        b /= getGCD(a, b);        
        for (int primeFactor : primeFactors) {
            b = getSimplified(b, primeFactor);
        }
        
        return (b == 1)? 1 : 2;
    }
    
//     private int getGCD(int num1, int num2) {
//         while (num2 > 0) {
//             int temp = num2;
//             num2 = num1 % num2; 
//             num1 = temp;
//         }
        
//         return num1;
//     }
    
    private int getGCD(int num1, int num2) {
        return (num2 == 0)? num1 : getGCD(num2, num1 % num2);
    }
    
    private int getSimplified(int num1, int num2) {
        while (num1 % num2 == 0) {
            num1 /= num2;
        }
        
        return num1;
    }
}