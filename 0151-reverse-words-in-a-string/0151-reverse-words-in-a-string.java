import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public String reverseWords(String s) {
        String[] wordList = s.split(" ");
        int listLen = wordList.length;
        
        StringBuilder reverseString = new StringBuilder();
    
        for(int i=listLen-1;i>=0;i--){
            if (wordList[i].equals(" ") || wordList[i].equals("")) continue;
            if (!reverseString.isEmpty()) reverseString.append(" ");
            reverseString.append(wordList[i]);
        }
        
        return reverseString.toString();
    }
}