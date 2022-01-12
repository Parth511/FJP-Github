class Solution {
    
    public void swap(int[] nums1, int a, int b){
        int temp = nums1[a];
        nums1[a] = nums1[b];
        nums1[b] = temp;
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++)
            nums1[m + i] = nums2[i];
        
        int gap = (n + m)/2 + (n + m)%2;
        while(gap > 0){
            for(int i = 0; i + gap < m + n; i++){
                if(nums1[i] > nums1[i + gap]){
                    swap(nums1, i, i + gap);
                }
            }
            if(gap > 1) gap = gap/2 + gap%2;
            else    gap = 0;
        }
    }
}