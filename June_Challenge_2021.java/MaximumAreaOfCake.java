// class Solution {
//     public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
//         List<Integer> list = new ArrayList<>();
    
//         int hlength = horizontalCuts.length;
//         int vlength = verticalCuts.length;
        
//         int hmax = 0;
//         int vmax = 0;
        
//         for(int i = 0;i < hlength;i++){    
//             for(int j = 0;j < vlength;j++){
//                 list.add((horizontalCuts[i] - hmax)*(verticalCuts[j] - vmax));
//                 vmax = Math.max(vmax,verticalCuts[j]);
//             }
//             hmax = Math.max(hmax,horizontalCuts[i]);
//         }
        
//         for(int i = 0;i < vlength;i++){
//             list.add((h - hmax)*(verticalCuts[i] - vmax));
//         }
//         for(int i = 0;i < hlength;i++){
//             list.add((horizontalCuts[i] - hmax)*(w - vmax));
//         }
        
//         int max = 0;
//         int i = 0;
//         while(i < list.size()){
//             if(max < list.get(i)){
//                 max = list.get(i);
//                 i++;
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long diffh = 0;
        long diffv = 0;
        int prevh = 0;
        int prevv = 0;
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        for(int i : horizontalCuts){
            diffh = Math.max(diffh, i - prevh);
            prevh = i;
        }
        
        for(int i : verticalCuts){
            diffv = Math.max(diffv, i - prevv);
            prevv = i;
        }
        
        diffh = Math.max(diffh, h - prevh);
        diffv = Math.max(diffv, w - prevv);
        
        int area = (int)((diffh*diffv) % (Math.pow(10,9) + 7));
        return area;
    }
}
