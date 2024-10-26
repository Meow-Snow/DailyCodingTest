class Solution {
    private static final String PATTERN = "1231";
    private static final int lenP = PATTERN.length();
    
    public int solution(int[] ingredients) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for (int ingredient : ingredients) {
            sb.append(ingredient);
            
            int lenSB = sb.length();            
            if (lenSB >= lenP && sb.substring(lenSB - lenP, lenSB).equals(PATTERN)) {
                sb.delete(lenSB - lenP, lenSB);
                answer++;
            }
        }
        
        return answer;
    }
}



// Java의 Stack 클래스는 Vector 클래스를 상속하기 때문에 Stack.get(int index)를 사용 가능
// import java.util.Stack;

// class Solution {
//     private static final int[] PATTERN = {1, 2, 3, 1};
//     private static int lenPt = PATTERN.length;
    
//     public int solution(int[] ingredients) {
//         Stack<Integer> stack = new Stack<>();
//         int answer = 0;
//         for (int ingredient : ingredients) {
//             stack.push(ingredient);
            
//             int sizeSt = stack.size();            
//             if (ingredient == PATTERN[lenPt - 1] && sizeSt >= lenPt) {
//                 boolean matchesPattern = true;
//                 for (int i = 0; i < lenPt; i++) {
//                     if (stack.get(sizeSt - 1 - i) != PATTERN[lenPt - 1 - i]) {
//                         matchesPattern = false;
//                         break;
//                     } 
//                 }
                
//                 if (matchesPattern) {
//                     answer++;
//                     for (int i = 0; i < lenPt; i++) {
//                         stack.pop();
//                     }
//                 }
//             }
//         }        
        
//         return answer;
//     }
// }



// Stack.get() 함수가 존재하지 않을 때 Stack을 활용한 풀이
// import java.util.Stack;

// class Solution {
//     private static final int[] PATTERN = {1, 2, 3, 1};
//     private static int lenP = PATTERN.length;
    
//     public int solution(int[] ingredients) {
//         Stack<Integer> stack = new Stack<>();
//         Stack<Integer> stack2 = new Stack<>();
//         int answer = 0;
//         for (int ingredient : ingredients) {
//             stack.push(ingredient);
            
//             if (ingredient == PATTERN[lenP - 1] && stack.size() >= lenP) {
//                 for (int i = lenP - 1; i >= 0; i--) {
//                     if (stack.peek() == PATTERN[i]) {
//                         stack2.push(stack.pop());
//                     } else {
//                         while (!stack2.isEmpty()) {
//                             stack.push(stack2.pop());
//                         }
//                         break;
//                     }
//                 }
                
//                 if (stack2.size() == lenP) {
//                     answer++;
//                     stack2.clear();
//                 }
//             }
//         }        
        
//         return answer;
//     }
// }