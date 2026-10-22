class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int longest =1;
        for(int num : set){
            
            if(!set.contains(num -1)){
                int length =1;
                int cur = num;
                while(set.contains(cur+1)){
                    cur++;
                    length++;
                }
                longest = Math.max(length,longest);
            }
            
        }
        return longest;
    }
}
