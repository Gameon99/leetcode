class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        int max = 0;
        for(int i = 0;i < length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int i = 0;i < length;i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}
