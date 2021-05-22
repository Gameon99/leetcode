class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int count = 0;
        int j = 0;
        for(int i = 0;i < length;i++){
            if(nums[i] == 0){
                count++;
            }else{
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i = length-count;i < length;i++){
            nums[i] = 0;
        }
    }
}
