class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int n : nums){
            countMap.put(n,countMap.getOrDefault(n,0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];

        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if(buckets[entry.getValue()] == null){
              buckets[entry.getValue()] = new ArrayList<>();  
            }
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] result = new int[k];

        for(int i=buckets.length-1;i>=0 && index < k ;i--){
            if(buckets[i] != null){
                for(int n : buckets[i]){
                    result[index++] = n;
                    if(index == k) return result;
                }
            }
        }
        return result;
    }
}
