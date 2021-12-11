import java.util.*;

class KokoEatingBananas {
    
    public static boolean isPossible(int[] piles, int speed, int hours){
        int currHours = 0;
        for(int banana: piles){
            currHours += banana/speed;
            if(banana%speed!=0) currHours++;
        }
        if(currHours <= hours)  return true;
        return false;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Arrays.stream(piles).max().getAsInt();
        int ans = high;
        
        while(low<=high){
            int midSpeed = low + (high - low)/2;
            if(isPossible(piles, midSpeed, h)==true){
                ans = midSpeed;
                high = midSpeed - 1;
            }else{
                low = midSpeed + 1;
            }
        }
        return ans;
    }
}