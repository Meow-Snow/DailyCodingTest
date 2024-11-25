class Solution {
    public int solution(int n, String control) {
        for (char cmd : control.toCharArray()) {
            switch (cmd) {
                case 'w' -> n++;
                case 's' -> n--;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        
        return n;
    }
}