class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}





// class Solution {
//     public String solution(String my_string) {
//         String[] strArr = {"a", "e", "i", "o", "u"};
//         for (String str : strArr) {
//             my_string = my_string.replace(str, "");
//         }
        
//         return my_string;
//     }
// }