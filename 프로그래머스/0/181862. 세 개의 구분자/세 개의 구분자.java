class Solution {
    public String[] solution(String myStr) {
        String[] strArr = myStr.replaceAll("[abc]+", " ").trim().split(" ");
        
        return (strArr[0].isEmpty())? new String[]{"EMPTY"} : strArr;
    }
}



// import java.util.Arrays;

// class Solution {
//     public String[] solution(String myStr) {
//         String[] strArr = myStr.split("[abc]+");
        
//         return (strArr.length == 0)? new String[]{"EMPTY"} : (strArr[0].isEmpty())? Arrays.copyOfRange(strArr, 1, strArr.length) : strArr;
//     }
// }