class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return ((ineq.equals(">")? n > m : n < m) || (eq.equals("=")? n == m : false))? 1 : 0;
    }
}



// class Solution {
//     public int solution(String ineq, String eq, int n, int m) {
//         if (ineq.equals(">") && n > m) return 1;
//         else if (ineq.equals("<") && n < m) return 1;
            
//         return (eq.equals("=") && n == m)?  1 : 0;        
//     }
// }