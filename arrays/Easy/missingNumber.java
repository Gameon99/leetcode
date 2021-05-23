class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        if(nums[0] != 0){
            return 0;
        }
        for(int i = 1;i < length;i++){
            if(nums[i] != nums[i-1] + 1){
                return nums[i] - 1;
            }
        }
        return nums[length-1] + 1;
    }
}
//
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for(int i = 0;i < length;i++){
            sum = sum + nums[i];
        }
        return (length*(length + 1))/2 - sum;
    }
}
