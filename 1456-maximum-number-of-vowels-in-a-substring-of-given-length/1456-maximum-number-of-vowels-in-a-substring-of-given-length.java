import java.util.List;
import java.util.Arrays;

class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowelArr = Arrays.asList('a','e','i','o','u');
        char[] charList = s.toCharArray();
        
        int maxCnt = 0;
        int vowelCnt = 0;
        
        int strLen = charList.length;
        int beginPoint = 0;
        int endPoint = 0;
        
        for(int i=0;i<strLen;i++) {
            
            endPoint = i;
            if(vowelArr.contains(charList[endPoint])) vowelCnt++;
            
            if(endPoint-beginPoint>=k) {
                if(vowelArr.contains(charList[beginPoint])) vowelCnt--;
                beginPoint++;
            } 
            
            maxCnt = Math.max(maxCnt, vowelCnt); 
        }
        
        return Math.min(k, maxCnt);
    }
}