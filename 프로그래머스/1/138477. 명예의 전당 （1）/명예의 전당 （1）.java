// PriorityQueue(=우선순위큐)를 활용하면 간단히 해결 가능
// PriorityQueue에 요소를 추가하면 MinHeap(최소 힙)을 기반으로 내부적으로 자동 정렬되어 가장 작은 요소가 큐의 root에 위치
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            pq.offer(score[i]);
            if (pq.size() > k) pq.poll();
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}



// import java.util.*;

// class Solution {
//     public int[] solution(int k, int[] score) {
//         int[] answer = new int[score.length];
//         List<Integer> scoreList = new ArrayList<>();
//         scoreList.add(0);
        
//         for (int i = 0; i < score.length; i++) {
//             for (int j = 0; j <= k; j++) {
//                 if (score[i] >= scoreList.get(j)) {
//                     scoreList.add(j, score[i]);
//                     break;
//                 }
//             }
            
//             answer[i] = (i < k)? scoreList.get(i) : scoreList.get(k - 1);
//         }
        
//         return answer;
//     }
// }