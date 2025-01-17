class Solution {
    public int solution(String A, String B) {
        for (int i = A.length(); i >= 0 ; i--) {
            StringBuilder sb = new StringBuilder();
            sb.append(A.substring(i)).append(A.substring(0, i));
            if (sb.toString().equals(B)) return A.length() - i;
        }
        
        return -1;
    }
}