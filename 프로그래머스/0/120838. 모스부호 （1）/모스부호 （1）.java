import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morseArr = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'".split(",");
        
        Map<String, String> morseMap = new HashMap<>();        
        for (String morse : morseArr) {
            String[] entry = morse.replace("'", "").split(":");
            morseMap.put(entry[0], entry[1]);
        }
        
        String[] letterArr = letter.split(" ");
        for (int i = 0; i < letterArr.length; i++) {
            letterArr[i] = morseMap.get(letterArr[i]);
        }
        
        return String.join("", letterArr);
    }
}