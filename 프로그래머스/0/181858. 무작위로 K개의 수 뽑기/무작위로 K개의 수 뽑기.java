import java.util.*;

class Solution {
    public Integer[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        Integer[] answer = new Integer[k];
        Arrays.fill(answer, -1);
        System.arraycopy(set.toArray(Integer[]::new), 0, answer, 0, Math.min(set.size(), k));
        
        return answer;
    }
}



// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int k) {
//         Set<Integer> set = new LinkedHashSet<>();
//         for (int num : arr) {
//             set.add(num);
//         }
        
//         Integer[] answer = Arrays.copyOfRange(set.toArray(Integer[]::new), 0, k);
//         Arrays.fill(answer, Math.min(k, set.size()), k, -1);
        
//         return Arrays.stream(answer).mapToInt(i -> i).toArray();
//     }
// }