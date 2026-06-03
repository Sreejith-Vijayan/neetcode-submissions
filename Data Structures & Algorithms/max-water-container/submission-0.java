class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int area = 0;
        int maxArea = 0;
        int minHeight;
        while(l<r){
            minHeight = Math.min(heights[l] , heights[r]);
            area = (r - l) * minHeight;
            if(area > maxArea){
                maxArea = area;
            }
            if(minHeight == heights[l]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}
