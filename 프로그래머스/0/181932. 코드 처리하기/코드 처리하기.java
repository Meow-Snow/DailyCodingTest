class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') mode = !mode;
            else if ((!mode && i % 2 == 0) || (mode && i % 2 != 0)) sb.append(c);
        }
        
        return sb.length() == 0? "EMPTY" : sb.toString();
    }
}



// class Solution {
//     public String solution(String code) {
//         StringBuilder sb = new StringBuilder();
//         int mode = 0;
//         for (int i = 0; i < code.length(); i++) {
//             if (mode == 0) {
//                 if (code.charAt(i) == '1') mode = 1;
//                 else if (i % 2 == 0) sb.append(code.charAt(i));
//             } else {
//                 if (code.charAt(i) == '1') mode = 0;
//                 else if (i % 2 != 0) sb.append(code.charAt(i));
//             }
//         }
            
//         return (sb.length() == 0)? "EMPTY" : sb.toString();
//     }
// }