import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int move : moves) {
            System.out.print(move + "->");
            for (int i = 0; i < board.length; i++) {
                int target = board[i][move - 1];
                if (target == 0) continue;
                if (!stack.isEmpty() && stack.peek() == target) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(target);                    
                }
                
                board[i][move - 1] = 0;
                break;
            }            
        }        
        
        return answer;
    }
}