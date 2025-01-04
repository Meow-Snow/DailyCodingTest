import java.util.*;

class Solution {
    public Integer[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int num : arr) {
            if (stk.isEmpty() || stk.peek() != num) stk.add(num);
            else stk.pop();
        }
        
        return stk.isEmpty()? new Integer[]{-1} : stk.toArray(Integer[]::new);
    }
}