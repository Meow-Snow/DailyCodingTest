class Solution {
    public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}



// class Solution {
//     public String solution(String myString, String pat) {
//         for (int i = myString.length(); i >= 0; i--) {
//             String target = myString.substring(0, i);
//             if (target.endsWith(pat)) return target;
//         }
        
//         return new String();
//     }
// }