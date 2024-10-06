// Array의 index로는 int만 사용 가능
// int -> size = 32 bit (4 byte), range = -2^31 ~ 2^31 - 1 (약 -21.5억 ~ 21.5억)
// long -> size = 64 bit (8 byte), range = -2^63 ~ 2^63 - 1
// 10,000,000 * 1,000 = 100억 이므로 int의 범위를 벗어나므로 long을 써야 한다

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            answer[i - 1] = (long) i * x;
        }
        
        return answer;
    }
}