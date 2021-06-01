//recursive solution
class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }else{
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}

//dp solution
class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        
        int[] count = new int[n+1];
        
        for(int i = 0;i <= 2;i++){
            count[i] = i;
        }
        for(int i = 3;i <= n;i++){
            count[i] = count[i-1] + count[i-2];
        }
        return count[n];
        
    }
}

