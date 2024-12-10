class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isComposite(i)) answer++;
        }
        
        return answer;
    }
    
    private boolean isComposite(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return true;
        }
        
        return false;
    }
}



// 굳이 약수의 개수를 모두 구해서 합성수인지 판단하는 방식은 비효율적이다
// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         for (int i = 1; i <= n; i++) {
//             if (getDivCnt(i) >= 3) answer++;
//         }
        
//         return answer;
//     }
    
//     private int getDivCnt(int number) {
//         int divCnt = 0;
//         for (int i = 1; i < Math.sqrt(number); i++) {
//             if (number % i == 0) divCnt += 2;
//         }
        
//         return (int) Math.sqrt(number) == Math.sqrt(number)? divCnt + 1 : divCnt;
//     }
// }