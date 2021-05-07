class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0;i < n;i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    //     int j = 0;
    //     int i = 0;
    //     int c = 0;
    //     int max = Math.max(n,m);
    //     if(n == 0){
    //         System.out.print(nums1);
    //     }
    //     else{
    //         for(int k = 0;k < max;k++){
    //             if(nums1[i] < nums2[j]){
    //                 i++;
    //             }else if(nums1[i] == nums2[j]){
    //                 nums1[m+c] = nums1[i+1];
    //                 c++;
    //                 nums1[i+1] = nums2[j];
    //                 i++;
    //                 j++;
    //             }else{
    //                 nums1[m+c] = nums1[i];
    //                 nums1[i] = nums2[j];
    //                 i++;
    //                 j++;
    //                 c++;
    //             }
    //         }
    //         for(int k = m+c;k < m+n;k++){
    //             if(j < n){
    //                 nums1[k] = nums2[j];
    //                 j++;
    //             }
    //         }
    //         System.out.print(nums1);
    //     }
    }
}
