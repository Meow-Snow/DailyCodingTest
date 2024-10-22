// 조카가 발음할 수 있는 단어(validWord)를 바로 빈 문자열("", empty string)로 대체할 경우 
// 그 단어 앞뒤의 문자들이 결합하여 원래 옹알이(babbling)에는 존재하지 않는 발음할 수 있는 단어를 형성 가능
// ex) ["ayayayae", "yemyea"] -> ["ye", "ma"] -> ["", ""]
// 따라서 일차적으로 공백 문자열(" ", space string)로 대체한 이후 마지막에 공백 문자열들을 빈 문자열로 대체

class Solution {
    public int solution(String[] babblings) {
        int answer = 0;
        String[] validWords = {"aya", "ye", "woo", "ma"};
        for (String babbling : babblings) {
            for (String validWord : validWords) {
                if (babbling.contains(validWord.repeat(2))) break;
                babbling = babbling.replace(validWord, " ");
            }
            if (babbling.replace(" ", "").length() == 0) answer++;
        }
        
        return answer;
    }
}