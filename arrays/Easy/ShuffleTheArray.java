class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int i = 0;
        int current = 0;
        int j = n;
        while(i < n){
            result[current] = nums[i];
            current++;
            i++;
            result[current] = nums[j];
            current++;
            j++;
        }
        return result;
    }
}
