class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            String key = sort(str);

            groups
                .computeIfAbsent(key, k -> new ArrayList<>())
                .add(str);
        }

        return new ArrayList<>(groups.values());
    }
    public String sort(String s) {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        s=new String(a);
        return s;
    }
}
