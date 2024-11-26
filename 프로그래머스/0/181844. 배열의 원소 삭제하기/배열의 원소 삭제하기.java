// List.remove()는 매개변수로 primitive type인 int가 들어가면 해당 리스트의 index로 인식하고
// ex) List.remove(3) -> list에서 index가 3인 데이터를 삭제
// boxed type인 Integer가 들어가면 index가 아닌 값 그 자체로 인식한다
// ex) List.remove(Integer.valueOf(3)) -> list에서 값이 3인 데이터를 삭제

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> numList = new ArrayList();
        for (int num : arr) {
            numList.add(num);
        }
        
        for (int num : delete_list) {
            numList.remove(Integer.valueOf(num));
        }
        
        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}