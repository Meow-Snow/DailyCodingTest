// 뉴클리드 호제법을 이용하면 더욱 빠르게 처리 가능./k  
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int GCD = getGCD(numer, denom);
            
        return new int[]{numer / GCD, denom / GCD};
    }
    
    private int getGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        
        return num1;
    }
}



// class Solution {
//     public int[] solution(int numer1, int denom1, int numer2, int denom2) {
//         return getSimplified(numer1 * denom2 + numer2 * denom1, denom1 * denom2);
//     }
    
//     private int[] getSimplified(int numer, int denom) {
//         for (int i = 2; i <= Math.min(numer, denom); i++) {
//             if (numer % i == 0 && denom % i == 0) {                
//                 int[] fraction = getSimplified(numer / i, denom / i);
//                 numer = fraction[0];
//                 denom = fraction[1];
//                 break;
//             }
//         }
        
//         return new int[]{numer, denom};
//     }
// }