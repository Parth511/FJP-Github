public class Solution {
    public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        int maxDiff = 0;
        for(int i=0; i<A.size(); i++)   maxDiff = Math.max(maxDiff, Math.abs(A.get(i) - B.get(i)));
        return maxDiff;
    }
}
