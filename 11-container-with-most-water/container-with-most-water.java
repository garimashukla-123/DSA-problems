class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
         int maxarea =0;
         while(right>left){
        int area = (right - left) * Math.min(height[left], height[right]);
         maxarea = Math.max(area, maxarea);
         
         if(height[right]>height[left]){
            left++;
         }
        else{
            right--;
         }

      
        } 
        return maxarea;
      
    }
} 