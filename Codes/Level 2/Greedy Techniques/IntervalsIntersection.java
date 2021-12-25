class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int ptr1 = 0, ptr2 = 0, n = firstList.length, m = secondList.length;
        ArrayList<int[]> intersection = new ArrayList<>();
        while(ptr1<n && ptr2<m){
            int[] curr = new int[2];
            curr[0] = Math.max(firstList[ptr1][0], secondList[ptr2][0]);
            curr[1] = Math.min(firstList[ptr1][1], secondList[ptr2][1]);
            
            if(curr[0] <= curr[1]){
                intersection.add(curr);
            }
            if(firstList[ptr1][1] < secondList[ptr2][1]){
                ptr1++;
            }else{
                ptr2++;
            }
        }
        int[][] ans = new int[intersection.size()][2];
        for(int i=0; i<intersection.size(); i++){
            ans[i] = intersection.get(i);
        }
        return ans;
    }
}