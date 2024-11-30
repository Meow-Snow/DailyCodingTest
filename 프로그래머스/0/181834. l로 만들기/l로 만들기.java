class Solution {
    public String solution(String myString) {
        char limit = 'l';
        for (char i = 'a'; i < limit; i++) {
            myString = myString.replace(i, limit);
        }
        
        return myString;
    }
}