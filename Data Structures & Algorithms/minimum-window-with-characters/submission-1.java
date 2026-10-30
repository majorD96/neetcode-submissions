class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[256];
        int minLen = Integer.MAX_VALUE;
        int l =0;
        int r=0;
        int m = t.length();
        int n = s.length();
        int start = -1;
        int count = 0;
        if(m>n) return "";
        for(char c : t.toCharArray()){
            freq[c]++;
        }
        while(r<n){
            if(freq[s.charAt(r)] > 0){
                count++;
            }
            freq[s.charAt(r)]--;
            while(m == count){
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)] > 0) count--;
                l++;
            }
            r++;
        }
        return start == -1 ? "" : s.substring(start,minLen+start);
    }
}
