class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (String key : keyinput) {
            switch (key) {
                case "up" -> answer[1] += (answer[1] < board[1] / 2)? 1 : 0;
                case "down" -> answer[1] -= (answer[1] > -1 * board[1] / 2)? 1 : 0;
                case "right" -> answer[0] += (answer[0] < board[0]/ 2)? 1 : 0;
                case "left" -> answer[0] -= (answer[0] > -1 * board[0] / 2)? 1 : 0;
            }
        }
        
        return answer;
    }
}