class Solution {
    public int solution(int[] wallet, int[] bill) {
        wallet = alignDimensions(wallet);
        bill = alignDimensions(bill);
        
        int answer = 0;
        while (bill[0] > wallet[0] || bill[1] > wallet[1]) {
            bill[1] /= 2;
            bill = alignDimensions(bill);
            
            answer++;
        }
        
        return answer;
    }
    
    private int[] alignDimensions(int[] something) {
        return new int[] {Math.min(something[0], something[1]), Math.max(something[0], something[1])};
    }
}