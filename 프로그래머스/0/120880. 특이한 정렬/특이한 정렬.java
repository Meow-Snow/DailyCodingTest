import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
            .boxed()
            .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n)? Integer.compare(b, a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
            .mapToInt(i -> i)
            .toArray();
    }
}



// import java.util.*;

// class Solution {
//     public int[] solution(int[] numlist, int n) {
//         Integer[] nums = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
//         Arrays.sort(nums, (a, b) -> {
//             int intComp = Integer.compare(Math.abs(a - n), Math.abs(b - n));
//             if (intComp == 0) return Integer.compare(b, a);
//             else return intComp;
//         });
        
//         return Arrays.stream(nums).mapToInt(i -> i).toArray();
//     }
// }