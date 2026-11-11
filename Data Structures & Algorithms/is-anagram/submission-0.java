class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        else {
            char arr[]=s.toCharArray();
            char arrr[]=t.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arrr);
            for(int i=0; i<s.length(); i++) {
                if(arr[i]!=arrr[i]) return false;
                
            }
            return true;
            
    }}
}
