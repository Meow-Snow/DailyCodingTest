import java.util.*;

class Solution {
    public Integer[] solution(int n) {
        List<Integer> primeDivisorList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) primeDivisorList.add(i);
        }
        
        return primeDivisorList.toArray(Integer[]::new);
    }
    
    private boolean isPrime(int div) {
        for (int i = 2; i <= Math.sqrt(div); i++) {
            if (div % i == 0) return false;
        }
        
        return true;
    }
}