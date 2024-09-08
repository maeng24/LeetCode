import java.util.Arrays;

class Solution {
    public int compress(char[] chars) {
    
        int count = 1;
        int charLen = chars.length;
        int charIndex = 1;
        
        for (int i=1;i<charLen;i++) {
            
            if(chars[i-1]==chars[i]){
                count++;
            }else{
                charIndex = setCntCharToArray(chars, count, charIndex);

                chars[charIndex++] = chars[i];
                count=1;
            }
        }
        
        charIndex = setCntCharToArray(chars, count, charIndex);
        
        chars = Arrays.copyOfRange(chars, 0, charIndex);

        return (int) chars.length;
    }
    
    public int setCntCharToArray(char[] chars, int count, int charIndex){
        if(count==1) return charIndex;
        
        char[] countChar = Integer.toString(count).toCharArray();
                
        for(char c: countChar){
            chars[charIndex++] = c;    
        }
        
        return charIndex;
    }
}