class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs)
        {
            char []c=new char[26];
            for(char ch:s.toCharArray())
            {
                c[ch-'a']++;
            }
            String key=String.valueOf(c);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
