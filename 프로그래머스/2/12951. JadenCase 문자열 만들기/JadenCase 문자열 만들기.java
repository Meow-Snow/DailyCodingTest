// split(" ")을 사용할 경우 문자열의 마지막 부분에 위치한 공백은 무시한다
// split(" ", -1)과 같이 두번째 파라미터로 음수를 입력하면 모든 요소들을 포함한 결과를 반환한다

class Solution {
    public String solution(String s) {
        String[] strArr = s.toLowerCase().split(" ", -1);
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].isEmpty()) continue;
            StringBuilder sb = new StringBuilder(strArr[i]);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            strArr[i] = sb.toString();
        }
        
        return String.join(" ", strArr);
    }
}