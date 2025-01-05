import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) stack.push(s.charAt(i));
            else stack.pop();
        }

        return stack.isEmpty()? 1 : 0;
    }
}



// Stack을 사용하지 않고서 String이나 StringBuilder의 상태로 조작하려면 매우 비효율적이다
// class Solution
// {
//     public int solution(String s)
//     {
//         StringBuilder sb = new StringBuilder(s);
//         boolean even = true;
//         while (even) {
//             even = false;
//             for (int i = 0; i < sb.length() - 1; i++) {
//                 if (sb.charAt(i) == sb.charAt(i + 1)) {
//                     sb = sb.delete(i, i + 2);
//                     even = true;
//                     break;
//                 }
//             }
//         }

//         return sb.length() == 0? 1 : 0;
//     }
// }