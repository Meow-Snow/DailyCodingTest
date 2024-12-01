// Integer.parseInt() -> 문자열을 기본형(primitive type) 정수로 변환
// Integer.valueOf() -> 문자열을 참조형(reference type, Wrapper Class) 정수로 변환

class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int num : num_list) {
            if (num % 2 != 0) odd.append(num);
            else even.append(num);
        }
        
        return Integer.parseInt(odd.toString()) + Integer.valueOf(even.toString());
    }
}