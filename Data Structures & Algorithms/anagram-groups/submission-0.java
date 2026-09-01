class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(int i =0;i<s.length();i++){
                count[s.charAt(i) -'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int c : count){
                sb.append("#").append(c);
            }
            String key = sb.toString();

            result.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

        }
        return new ArrayList<>(result.values());
    }
}
