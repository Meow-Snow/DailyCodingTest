class Solution {
    public int solution(String myString, String pat) {
        return myString.replace("A", "b").replace("B", "a").toUpperCase().contains(pat)? 1 : 0;
    }
}