class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int sum = 0;
        for(int i = 0;i < length;i++){
            nums[i] = sum + nums[i];
            sum = nums[i];
        }
        return nums;
    }
}
