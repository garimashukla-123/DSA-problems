class Solution {
    public int removeDuplicates(int[] nums) {
        // for(int i = 0; i < nums.lenght; i++){
          if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2; // index to place the next valid element

        for (int i = 2; i < nums.length; i++) {
            // allow nums[i] only if it is different from nums[k - 2]
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}