import java.util.Stack;
import java.util.LinkedList;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int minNum = Integer.MAX_VALUE;
        int midNum = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(minNum>=num){
                minNum = num;
            }else if(midNum>=num){
                midNum = num;
            }else {
                return true;
            }
        }
        
        return false;
    }
}