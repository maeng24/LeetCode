class Solution {
    public int maxArea(int[] height) {
        
        int startPoint = 0;
        int endPoint = height.length-1;
        int maxArea = 0 ;
        
        while(startPoint<endPoint){
            int waterArea = Math.min(height[startPoint], height[endPoint]) * (endPoint-startPoint);
        
            maxArea = Math.max(waterArea, maxArea);
            
            if(height[startPoint]<=height[endPoint]) startPoint++;
            else endPoint--;
        }
        
        return maxArea;
    }
}