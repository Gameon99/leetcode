class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int length = nums.length;
        int[] dup = new int[length];
        
        int i = 0;
        
        while(i != length){
            dup[i] = nums[i];
            i++;
        }
        
        Arrays.sort(dup);
        if(dup[length-1] <= 0){
            return dup[length-1];
        }
        
        i = 0;
        int max = nums[0];
        while(i != length){
            sum = sum + nums[i];
            if(sum < 0){
                sum = 0;
            }
            else if(sum > max){
                max = sum;
            }
            i++;
        }
        return max;
    }
}
