class Solution {
    public int solution(int[][] sizes) {
        int[] wallet = new int[2];
        for (int[] size : sizes) {
            wallet[0] = Math.max(wallet[0], Math.max(size[0], size[1]));
            wallet[1] = Math.max(wallet[1], Math.min(size[0], size[1]));
        }
        
        return wallet[0] * wallet[1];
    }
}