class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length = nums.length;
        int count = 0;
        for(int i = 0;i < length;i = i + 2){
            count = count + nums[i];
        }
        int index = 0;
        int[] array = new int[count];
        for(int i = 1;i < length;i=i+2){
            int freq = nums[i-1];
            int val = nums[i];
            while(freq-- != 0){
                array[index++] = val;
            }
        }
        return array;
    }
}
