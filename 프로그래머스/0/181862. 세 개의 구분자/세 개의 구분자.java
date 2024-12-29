// replaceAll()과 trim()을 활용하면 간단히 해결 가능
// replace()로는 정규식 사용 불가

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