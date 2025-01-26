import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : new int[]{a, b, c, d}) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<int[]> list = new ArrayList<>();
        for (int key : map.keySet()) {
            list.add(new int[]{map.get(key), key});
        }
        
        Collections.sort(list, (x, y) -> Integer.compare(x[0], y[0]));
        int num1 = list.get(0)[1];
        int num2 = (list.size() > 1)? list.get(1)[1] : 0;
        
        switch (map.keySet().size()) {
                case 1 -> {return 1111 * a;}
                case 2 -> {if (list.get(0)[0] != list.get(1)[0])
                    return (int) Math.pow(10 * num2 + num1, 2);}
                case 3 -> {return num1 * num2;}
                case 4 -> {return Math.min(Math.min(a, b), Math.min(c, d));}
        }
        
        return (num1 + num2) * Math.abs(num1 - num2);
    }
}