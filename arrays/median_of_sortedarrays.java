class Solution {
//   public static void main(String[] args){
//         int[] nums1 = new int[]{1,1};
//         int[] nums2 = new int[]{2,3};

//         System.out.println(findMedian(sortArray(addArrays(nums1,nums2))));

//     }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return findMedian(sortArray(addArrays(nums1,nums2)));        
    }
     public static int[] addArrays(int[] nums1, int[] nums2){
        int length1 = nums1.length;
        int length2 = nums2.length;
        int totallength =length1 + length2;

        int[] array = new int[totallength];

        for(int i = 0;i < length1;i++){
            array[i] = nums1[i];
        }
        for(int i = 0;i < length2;i++){
            array[i+length1] = nums2[i];
        }
        return array;
    }
    public static int[] sortArray(int[] array){
        int l = 0;
        int r = array.length-1;
        return mergeSort(array,l,r);
    }
    public static int[] mergeSort(int[] array, int l , int r){
        if(l < r){
            int m = (l + r)/2;
            mergeSort(array,l,m);
            mergeSort(array,m+1,r);
            merge(array,l,m,r);
        }
        return array;
    }
    public static int[] merge(int[] array, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0;i < n1;i++){
            L[i] = array[l+i];
        }
        for(int i = 0;i < n2;i++){
            R[i] = array[m+1+i];
        }

        int i = 0,j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }else{
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = R[j];
            j++;
            k++;
        }
        return array;
    }
    public static double findMedian(int[] array){
        int length = array.length;
        DecimalFormat df = new DecimalFormat("###.#####");
        double result = 0;
        if(length % 2 != 0){
            result = (double)array[(length-1)/2];
        }else {
            result = (double) (array[(length - 1) / 2] + array[length / 2])/2;
        }
        String string = df.format(result);
        result = Double.valueOf(string);
        return result;
    }
}
