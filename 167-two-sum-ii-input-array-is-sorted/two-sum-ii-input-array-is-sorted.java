class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        int left = 0;
        int right = numbers.length -1;
        while(left<right){
            if(numbers[left] + numbers[right] == target){
                a[0] = left+1;
                a[1] = right+1;
                break;
            }
            if(numbers[left] + numbers[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return a;
        
    }
}