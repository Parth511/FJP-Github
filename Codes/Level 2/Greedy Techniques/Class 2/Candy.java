
// same for temple offerings
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] leftToRight = new int[n], rightToLeft = new int[n];
        leftToRight[0] = 1;
        rightToLeft[n-1] = 1;
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1])
                leftToRight[i] = leftToRight[i-1] + 1;
            else if(ratings[i] == ratings[i-1])
                leftToRight[i] = leftToRight[i-1];
            else
                leftToRight[i] = 1;
        }
        
        for(int i = n-2; i>=0; i--){
            if(ratings[i] < ratings[i+1])
                rightToLeft[i] = rightToLeft[i+1] + 1;
            else if(ratings[i] == ratings[i+1])
                rightToLeft[i] = rightToLeft[i+1];
            else
                rightToLeft[i] = 1;
        }
        
        int sum = 0;
        for(int i=0; i<n; i++)
            sum += Math.max(leftToRight[i], rightToLeft[i]);
        return sum;
    }
}