class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Long>, List<String>> map = new HashMap<>();
        for(String s: strs) {
            Map<Character, Long> m = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            List<String> l;
            if(map.containsKey(m)) {
                l = map.get(m);
            } else {
                l = new ArrayList<>();
            }
            l.add(s);
            map.put(m, l);
        }
        return new ArrayList<>(map.values());
    }
}
