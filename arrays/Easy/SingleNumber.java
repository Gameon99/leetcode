class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}

//Using XOR - bit manipulation
int x = 0;
for(int n : nums){
   x = x ^ n;
}
return x;
