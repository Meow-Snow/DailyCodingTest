// Arrays.sort(arr, Collections.reverseOrder())
// -> Integer[] 배열과 같은 참조 타입 배열에만 사용 가능 
// -> int[]와 같은 기본 타입 배열에는 직접 사용 불가
// -> Collections.reverseOrder()가 Comparator<? super T>를 반환하기 때문에 참조 타입을 필요로 하기 때문

import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] emrg = emergency.clone();
        Arrays.sort(emrg);        
        
        Map<Integer, Integer> priorityMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            priorityMap.put(emrg[i], len - i);
        }
        
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = priorityMap.get(emergency[i]);
        }
        
        return answer;
    }
}