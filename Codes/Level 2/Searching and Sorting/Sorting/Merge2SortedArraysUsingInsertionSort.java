class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            nums1[m + i] = nums2[i];
            int k = m + i;
            while(k > 0 && nums1[k-1] > nums1[k]){
                int temp = nums1[k - 1];
                nums1[k - 1] = nums1[k];
                nums1[k] = temp;
                k--;
            }
        }
    }
}