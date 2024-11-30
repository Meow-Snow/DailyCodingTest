class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int num : num_list) {
            if (num % 2 != 0) odd.append(num);
            else even.append(num);
        }
        
        return Integer.parseInt(odd.toString()) + Integer.valueOf(even.toString());
    }
}