class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for(int i = 0;i < length;i++){
            sum += (((i+1)*(length-i)+1)/2)*arr[i];
        }
        return sum;
    }
}
