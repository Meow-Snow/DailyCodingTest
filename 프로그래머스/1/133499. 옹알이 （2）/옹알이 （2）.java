class Solution {
    public int solution(String[] babblings) {
        int answer = 0;
        String[] validBabblings = {"aya", "ye", "woo", "ma"};
        for (String babbling : babblings) {
            for (String validBabbling : validBabblings) {
                if (babbling.contains(validBabbling.repeat(2))) break;
                babbling = babbling.replace(validBabbling, " ");
            }
            if (babbling.replace(" ", "").length() == 0) answer++;
        }
        
        return answer;
    }
}