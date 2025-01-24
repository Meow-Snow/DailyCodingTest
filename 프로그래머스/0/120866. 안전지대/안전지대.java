class Solution {
    public int solution(int[][] board) {
        boolean[][] flags = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (isOnTheBoard(board, k, l)) flags[k][l] = true;
                        }
                    }
                }
            }
        }
                
        return cntSafeZones(flags);
    }
    
    private boolean isOnTheBoard(int[][] board, int l, int w) {
        if (l < 0 || l >= board.length || w < 0 || w >= board[0].length) return false;
        
        return true;
    }
    
    private int cntSafeZones(boolean[][] flags) {
        int cnt = 0;
        for (int i = 0; i < flags.length; i++) {
            for (int j = 0; j < flags[0].length; j++) {
                if (!flags[i][j]) cnt++;
            }
        }
        
        return cnt;
    }
}