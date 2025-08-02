class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> anagrams = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            String key = sortString(strs[i]);
            if(map.containsKey(key)) {
                List<String> list = map.get(key);
                list.add(strs[i]);
            }
            else {
                List<String> words = new ArrayList<>();
                words.add(strs[i]);
                map.put(key, words);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> list = entry.getValue();
            anagrams.add(list);
        }
        return anagrams;
    }


    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}

