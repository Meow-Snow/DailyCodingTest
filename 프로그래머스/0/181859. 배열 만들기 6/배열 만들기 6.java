import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int num : arr) {
            if (stk.isEmpty() || stk.peek() != num) stk.push(num);
            else stk.pop();
        }
        
        return stk.isEmpty()? new int[]{-1} : stk.stream().mapToInt(i -> i).toArray();
    }
}



// import java.util.*;

// class Solution {
//     public Integer[] solution(int[] arr) {
//         Stack<Integer> stk = new Stack<>();
//         for (int num : arr) {
//             if (stk.isEmpty() || stk.peek() != num) stk.push(num);
//             else stk.pop();
//         }

//         return stk.isEmpty()? new Integer[]{-1} : stk.toArray(Integer[]::new);
//     }
// }