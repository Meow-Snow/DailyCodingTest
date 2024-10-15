class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;
        for (int num : num_list) {
            sum += num;
            product *= num;
        }
        
        return (sum * sum < product)? 0 : 1;
    }
}



// import java.util.Arrays;

// class Solution {
//     public int solution(int[] num_list) {
//         int sum = Arrays.stream(num_list).sum();
//         int product = Arrays.stream(num_list).reduce(1, (a , b) -> a * b);
        
//         return (Math.pow(sum, 2) < product)? 0 : 1;
//     }
// }