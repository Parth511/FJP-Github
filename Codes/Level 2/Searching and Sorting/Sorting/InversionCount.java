public void mergeSort(int[] nums, int low, int high){
    if(low >= high){
        return;
    }
    int mid = low + (high - low)/2;
    mergeSort(nums, low, mid);
    mergeSort(nums, mid + 1, high);
    merge(nums, low, mid, mid + 1, high);
}

public void merge(int[] nums, int a1l, int a1r, int a2l, int a2r){
    int size = (a1r - a1l + 1) + (a2r - a2l + 1), ptr1 = a1l, ptr2 = a2l, ptr3 = 0;
    int[] res = new int[size];
    while(ptr1 <= a1r && ptr2 <= a2r){
        if(nums[ptr1] <= nums[ptr2]){
            res[ptr3++] = nums[ptr1++];
        }else{
            res[ptr3++] = nums[ptr2++];    
        }
    }
    while(ptr1 <= a1r){
        res[ptr3++] = nums[ptr1++];
    }
    while(ptr2 <= a2r){
        res[ptr3++] = nums[ptr2++];
    }
    for(int i=a1l; i<=a2r; i++)
        nums[i] = res[i-a1l];
}