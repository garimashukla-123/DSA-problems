class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i = 0; i<k;i++){
            p.add(nums[i]);
        }
        for(int i =k ; i < nums.length ; i++){
            if(nums[i]>p.peek()){
                p.remove();
                p.add(nums[i]);
            }
            
        } 
        return p.peek();
       
    } 
}