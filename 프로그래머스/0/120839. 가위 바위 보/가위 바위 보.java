class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (char c : rsp.toCharArray()) {
            char counter = switch(c) {
                    case '2' -> '0';
                    case '0' -> '5';
                    case '5' -> '2';
                    default -> 'x';
            };            
            sb.append(counter);
        }
        
        return sb.toString();
    }
}