//since majority element appears more than n/2 times, when sorted, it definitely takes the middle position.
class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
