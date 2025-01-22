class Solution {
    private static final String[] marks = {"O", "X"};
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int num1 = Integer.parseInt(temp[0]);
            int num2 = Integer.parseInt(temp[2]);
            int result = (temp[1].equals("+"))? num1 + num2 : num1 - num2;
            
            answer[i] = (result == Integer.parseInt(temp[4]))? marks[0] : marks[1];
        }
        
        return answer;
    }
}