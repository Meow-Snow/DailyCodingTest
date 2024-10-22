// 조카가 발음할 수 있는 단어(validBabbling)를 바로 빈 문자열("", empty string)으로 대체할 경우 
// 그 단어 앞뒤의 문자들이 결합하여 원래 옹알이(babbling)에는 존재하지 않는 발음할 수 있는 단어를 형성 가능
// 따라서 일차적으로 공백 문자열(" ", space string)로 대체한 이후 마지막에 공백 문자열들을 빈 문자열로 대체

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