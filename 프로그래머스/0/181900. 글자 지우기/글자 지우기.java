class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int idx : indices) {
            sb.setCharAt(idx, '?');
        }
        
        return sb.toString().replace("?", "");
    }
}



// import java.util.Arrays;

// class Solution {
//     public String solution(String my_string, int[] indices) {
//         String[] strArr = my_string.split("");
//         for (int i = 0; i < indices.length; i++) {
//             strArr[indices[i]] = "";
//         }        
        
//         return String.join("", strArr);
//     }
// }