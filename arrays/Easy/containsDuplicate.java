class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0;i < length;i++){
            if(set.contains(nums[i])){
                count = 1;
            }
            set.add(nums[i]);
        }
        if(count == 1){
            return true;
        }else{
            return false;
        }
    }
}
