class Solution {
    private static final String[] menu = {"cafelatte", "americano"};
    private static final int[] price = {5000, 4500};    
    public int solution(String[] orders) {
        int answer = 0;
        for (String order : orders) {
            if (order.contains(menu[0])) answer += price[0];
            else answer += price[1];
        }
        
        return answer;
    }
}