class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        for (char c : String.valueOf(age).toCharArray()) {
            sb.append((char) (Character.getNumericValue(c) + 'a'));
        }
        
        return sb.toString();
    }
}