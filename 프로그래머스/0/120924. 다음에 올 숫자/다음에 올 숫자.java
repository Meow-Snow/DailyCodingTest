class Solution {
    public int solution(int[] common) {
        int len = common.length;
        int last = common[len - 1];
        int prev = common[len - 2];
        
        return (last - prev == prev - common[len - 3])? 2 * last - prev : last * last / prev;
    }
}