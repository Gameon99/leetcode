class Solution {
    public int xorOperation(int n, int start) {
        int[] array = new int[n];
        
        for(int i = 0;i < n;i++){
            array[i] = start + 2*i;
        }
        int result = start;
        for(int i = 1; i < n;i++){
            result = result ^ array[i];
        }
        
        return result;
        
    }
}
