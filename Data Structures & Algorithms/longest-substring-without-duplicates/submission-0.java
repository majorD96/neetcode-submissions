class Solution {
    public int lengthOfLongestSubstring(String s) {

        int length = 0;
        HashSet<Character> seen = new HashSet<>();
        int left=0;
        for(int index=0;index<s.length();index++){
            while(seen.contains(s.charAt(index))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(index));
            length = Math.max(length,index-left+1);
            
        }
        return length;
    }
}
