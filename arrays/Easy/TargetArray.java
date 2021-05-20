class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int length = nums.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < length;i++){
            list.add(index[i],nums[i]);
        }
        int[] array = new int[length];
        for(int i = 0;i < length;i++){
            array[i] = list.get(i);
        }
        return array;
    }
}
