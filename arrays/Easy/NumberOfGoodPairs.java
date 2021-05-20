class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int length = nums.length;
        for(int i = 0;i < length;i++){
            for(int j = i+1;j < length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
