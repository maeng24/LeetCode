
import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multNums = 1;
        int zeroNum = 0;
        int len = nums.length;
        int zeroIndex = 0;

        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                multNums*=nums[i];
            }else{
                zeroNum++;
                zeroIndex=i;
            }
        }

        int[] answer = new int[len];

        if(zeroNum > 1){
            Arrays.fill(answer, 0);
        }else if(zeroNum == 1){
            Arrays.fill(answer, 0);
            answer[zeroIndex] = multNums;
        }else{
            for(int i=0; i<len; i++){
                answer[i]=multNums/nums[i];
            }
        }
        
        return answer;
        
    }
}