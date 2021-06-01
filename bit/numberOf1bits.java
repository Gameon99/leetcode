public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 1; i < 33; i++){
            if(((n & (1<<i)) != 0) == true){
                count++;
            }
        }
        return count;
    }
}
