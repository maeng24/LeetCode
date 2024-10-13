class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, maxCnt = 0;
        int zeroCnt = 0;

        while(right < nums.length) {
            if(nums[right] == 0){
                
                if(zeroCnt > 0) {
                     maxCnt = Math.max(maxCnt, right -left);
                     while(zeroCnt != 0) {
                        if(nums[left] == 0) {
                            zeroCnt = 0;
                        }
                        left++;
                     }
                }
                zeroCnt++;
            }
            right++;
        }

        maxCnt = Math.max(maxCnt, right - left);

        return maxCnt == 0 ? 0 : maxCnt -1 ;
    }
}