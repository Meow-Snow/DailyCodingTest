class Solution {
    public int solution(int[] numbers) {
        int max1 = 0;
        int max2 = 0;
        
        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            }
            else if (number > max2) max2 = number;                
        }
        
        return max1 * max2;
    }
}



// import java.util.*;

// class Solution {
//     public int solution(int[] numbers) {
//         int len = numbers.length;
//         Arrays.sort(numbers);
        
//         return numbers[len - 1] * numbers[len - 2];
//     }
// }