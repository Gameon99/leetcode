class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for(int i : nums1){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else{
                map.put(i,1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : nums2){
            if(map.containsKey(i)){
                if(map.get(i) > 1){
                    map.put(i,map.get(i) - 1);
                }
                else{
                    map.remove(i);
                }
            list.add(i);
            }
        }
        
        int[] array = new int[list.size()];
        int i = 0;
        while(i < list.size()){
            array[i] = list.get(i);
            i++;
        }
        
        return array;
    }
}
