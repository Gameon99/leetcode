class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
//         HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
//         for(int i : nums1){
//             if(map.containsKey(i)){
//                 map.put(i,map.get(i) + 1);
//             }else{
//                 map.put(i,1);
//             }
//         }
        
//         List<Integer> list = new ArrayList<>();
        
//         for(int i : nums2){
//             if(map.containsKey(i)){
//                 if(map.get(i) > 1){
//                     map.put(i,map.get(i) - 1);
//                 }
//                 else{
//                     map.remove(i);
//                 }
//             list.add(i);
//             }
//         }
        
//         int[] array = new int[list.size()];
//         int i = 0;
//         while(i < list.size()){
//             array[i] = list.get(i);
//             i++;
//         }
        
//         return array;
        
        int length1 = nums1.length;
        int length2 = nums2.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int p1 = 0,p2 = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        while(p1 < length1 && p2 < length2){
            if(nums1[p1] > nums2[p2]){
                p2++;
            }else if(nums1[p1] < nums2[p2]){
                p1++;
            }else{
                list.add(nums1[p1]);
                p1++;
                p2++;
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
