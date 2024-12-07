class Solution {
    public int solution(String binomial) {
        String[] binomialArr = binomial.split(" ");
        int answer = Integer.parseInt(binomialArr[0]);        
        for (int i = 1; i < binomialArr.length; i += 2) {
            int value = Integer.parseInt(binomialArr[i + 1]);            
            switch (binomialArr[i]) {
                    case "+" -> answer += value;
                    case "-" -> answer -= value;
                    case "*" -> answer *= value;
            }
        }
        
        return answer;
    }
}