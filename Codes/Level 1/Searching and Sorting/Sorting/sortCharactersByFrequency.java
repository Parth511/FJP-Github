class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        
        ArrayList<Character>[] bucket = new ArrayList[s.length() + 1];
        
        for(int i=0; i<bucket.length; i++)
            bucket[i] = new ArrayList<>();
        
        for(Character ch: freq.keySet()){
            int val = freq.get(ch);
            bucket[val].add(ch);
        }

        StringBuilder sb = new StringBuilder("");
        for(int b =bucket.length - 1; b>=0; b--){
            for(Character ch: bucket[b]){
                for(int f=0; f<b; f++)
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}