class Solution {
    public String solution(String[] arr) {
        char[] charArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            charArr[i] = arr[i].charAt(0);
        }
        
        return String.valueOf(charArr);
    }
}