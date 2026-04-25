class Solution {
    public boolean isAnagram(String s, String t) {
        
        List<Character> sourceList = s.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.toList());

        List<Character> destList = t.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.toList());


        Collections.sort(sourceList);
        Collections.sort(destList);
        return sourceList.equals(destList);
    }
}
