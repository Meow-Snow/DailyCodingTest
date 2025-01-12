class Solution {
    public int solution(String[] spells, String[] dic) {
        for (String word : dic) {
            boolean contains = true;
            for (String spell : spells) {
                if (!word.contains(spell)) {
                    contains = false;
                    break;
                }
            }
            
            if (contains) return 1;
        }
        
        return 2;
    }
}



// class Solution {
//     public int solution(String[] spells, String[] dic) {
//         for (String word : dic) {
//             boolean contains = false;
//             for (String spell : spells) {
//                 if (word.contains(spell)) contains = true;
//                 else {
//                     contains = false;
//                     break;
//                 }
//             }
            
//             if (contains) return 1;
//         }
        
//         return 2;
//     }
// }