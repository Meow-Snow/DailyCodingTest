import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] nums = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, (a, b) -> {
            int intComp = Integer.compare(Math.abs(a - n), Math.abs(b - n));
            if (intComp == 0) return Integer.compare(b, a);
            else return intComp;
        });
        
        return Arrays.stream(nums).mapToInt(i -> i).toArray();
    }
}