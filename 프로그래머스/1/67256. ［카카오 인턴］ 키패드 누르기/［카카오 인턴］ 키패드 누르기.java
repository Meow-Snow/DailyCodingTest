import java.util.*;

class Solution {
    private static final int[][] KEY_PAD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -2}};
    private static final Set<Integer> LEFT_KEYS = new HashSet<>(Arrays.asList(1, 4, 7));
    private static final Set<Integer> RIGHT_KEYS = new HashSet<>(Arrays.asList(3, 6, 9));
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static String hand;
    private static int keyLeftHand = -1;
    private static int keyRightHand = -2;
    
    public String solution(int[] numbers, String hand) {
        this.hand = hand.equals("left")? "L" : "R";
        Map<Integer, int[]> keyMap = new HashMap<>();        
        for (int i = 0; i < KEY_PAD.length; i++) {
            for (int j = 0; j < KEY_PAD[i].length; j++) {
                keyMap.put(KEY_PAD[i][j], new int[]{i, j});
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            if (LEFT_KEYS.contains(num)) {
                sb.append(LEFT);
                keyLeftHand = num;
            } else if (RIGHT_KEYS.contains(num)) {
                sb.append(RIGHT);
                keyRightHand = num;
            } else {
                int distanceLeftHand = getDistance(keyMap, keyLeftHand, num);
                int distanceRightHand = getDistance(keyMap, keyRightHand, num);
                
                if (distanceLeftHand < distanceRightHand) {
                    sb.append(LEFT);
                    keyLeftHand = num;
                } else if (distanceLeftHand > distanceRightHand) {
                    sb.append(RIGHT);
                    keyRightHand = num;
                } else {
                    sb.append(this.hand);
                    if (this.hand.equals(LEFT)) {
                        keyLeftHand = num;
                    } else {
                        keyRightHand = num;
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private int getDistance(Map<Integer, int[]> keyMap, int curKey, int nextKey) {
        int[] curKeyPos = keyMap.get(curKey);
        int[] nextKeyPos = keyMap.get(nextKey);
        
        return Math.abs(curKeyPos[0] - nextKeyPos[0]) + Math.abs(curKeyPos[1] - nextKeyPos[1]);
    }
}