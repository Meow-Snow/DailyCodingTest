// String.join(delimeter, String[]) : 문자열 배열의 원소들 사이에 구분자를 넣어서 연결한 하나의 문자열을 반환
class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}



// class Solution {
//     public String solution(String[] arr) {
//         char[] charArr = new char[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             charArr[i] = arr[i].charAt(0);
//         }
        
//         return String.valueOf(charArr);
//     }
// }



// class Solution {
//     public String solution(String[] arr) {
//         StringBuilder sb = new StringBuilder();
//         for (String str : arr)
//             sb.append(str);
        
//         return sb.toString();
//     }
// }