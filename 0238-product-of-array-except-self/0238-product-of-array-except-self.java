import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multNums = 1;
        int zeroNum = 0;
        int len = nums.length;
        ArrayList<Integer> zeroIndex = new ArrayList();

        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                multNums*=nums[i];
            }else{
                zeroNum++;
                zeroIndex.add(i);
            }
        }

        int[] answer = new int[len];

        if(zeroNum > 1){
            Arrays.fill(answer, 0);
        }else if(zeroNum == 1){
            Arrays.fill(answer, 0);
            answer[zeroIndex.get(0)] = multNums;
        }else{
            for(int i=0; i<len; i++){
                answer[i]=multNums/nums[i];
            }
        }
        
        return answer;
        
    }
}