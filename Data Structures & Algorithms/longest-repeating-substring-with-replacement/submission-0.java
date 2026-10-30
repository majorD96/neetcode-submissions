class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq=0;
        int left =0;
        int max = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq,freq[ch -'A']);
            while((right-left+1) - maxFreq >k){
                freq[s.charAt(left) -'A']--;
                left++;
            }
            max = Math.max(max,(right-left+1));
        }
        return max;
    }
}
