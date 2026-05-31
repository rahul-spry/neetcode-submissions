class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> returnList = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars); 
            String key = new String(chars);
            map.compute(key, (k,v) -> (v == null) ? new ArrayList<>() : v).add(s);
            //map.computeIfPresent(key, (k, v)-> v).add(s);
        }
        //System.out.println("MAP : "+map);
        for(String key : map.keySet()){
            returnList.add(map.get(key));
        }
        return returnList;
    }
}
