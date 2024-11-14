class Solution {
    public int solution(int[] num_list) {
        int sum = 0, product = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            product *= num_list[i];
        }
        
        return (num_list.length >= 11)? sum : product;
    }
}