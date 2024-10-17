class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int wordIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char num = (wordIdx++ % 2 == 0)? Character.toUpperCase(c) : Character.toLowerCase(c);
            answer.append(num);
            
            if (c == ' ') wordIdx = 0;
        }
        
        return answer.toString();
    }
}



// class Solution {
//     public String solution(String s) {
//         char[] charArr = s.toCharArray();
//         int wordIdx = 0;                
//         for (int i = 0; i < charArr.length; i++) {
//             char c = charArr[i];
//             if (c == ' ') wordIdx = 0;
//             else charArr[i] = (wordIdx++ % 2 == 0)? Character.toUpperCase(c) : Character.toLowerCase(c);
//         }
        
//         return String.valueOf(charArr);
//     }
// }