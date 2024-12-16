class Solution {
    public int[] solution(int[] arr) {
        int radix = 0;
        while (Math.pow(2, radix++) < arr.length) {}        
        
        int[] answer = new int[(int) Math.pow(2, radix - 1)];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}



// Arrays 클래스의 copyOfRange() 메서드를 사용하는 편이 더 간단하다
// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] arr) {
//         int len = 1;
//         while (len < arr.length) {
//             len *= 2;
//         }
        
//         return Arrays.copyOfRange(arr, 0, len);
//     }
// }