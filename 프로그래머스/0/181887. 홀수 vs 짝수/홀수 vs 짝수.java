class Solution {
    public int solution(int[] num_list) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < num_list.length - 1; i += 2) {
            sum1 += num_list[i];
            sum2 += num_list[i + 1];
        }
        
        if (num_list.length % 2 != 0) {
            sum1 += num_list[num_list.length - 1];
        }
        
        return Math.max(sum1, sum2);
    }
}