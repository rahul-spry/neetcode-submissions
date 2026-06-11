class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] charCount = new int[26];
            for(char c : str.toCharArray()){
            int i = (int)c;
            charCount[i - 97]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : charCount) {
            sb.append((char) num);
        }
        String key = sb.toString();
        map.computeIfPresent(key, (k, v)->{
            v.add(str);
            return v;
        });

        map.computeIfAbsent(key, k -> {
            List<String> list = new ArrayList();
            list.add(str);
            return list;
        });


        }
        for(String key : map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
}
