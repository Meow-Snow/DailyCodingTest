import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<String> strList = new ArrayList<>();
        for (String str : my_string.split("")) {
            if (!strList.contains(str)) strList.add(str);
        }
        
        return String.join("", strList);
    }
}



// LinkedHashSet을 이용하면 간단하게 해결할 수 있다
// import java.util.*;

// class Solution {
//     public String solution(String my_string) {
//         return String.join("", new LinkedHashSet<String>(Arrays.asList(my_string.split(""))));
//     }
// }